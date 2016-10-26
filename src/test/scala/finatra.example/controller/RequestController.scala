package finatra.example.controller

import com.twitter.finagle.http.Status.Ok
import com.twitter.finatra.http.EmbeddedHttpServer
import com.twitter.finatra.thrift.ThriftClient
import com.twitter.inject.server.FeatureTest
import finatra.example.Server

/**
 * Created by SangDang on 9/18/16.
 */
class RequestController extends FeatureTest {
  override protected val server = new EmbeddedHttpServer(twitterServer = new Server)

  "[HTTP] Simple Request" should {
    "return properly data" in {
      server.httpGet(
        path = "/simple/1?name=test",
        andExpect = Ok,
        withJsonBody =
          """
            |{
            | "id" : 1,
            | "name" : "test"
            |}
          """.stripMargin
      )
    }


  }
  "[HTTP] Custom Request" should {
    "always return x" in {
      server.httpGet(
        path = "/custom",
        andExpect = Ok,
        withJsonBody =
          """
            |{
            | "data" : "x"
            |}
          """.stripMargin
      )
    }


  }
}
