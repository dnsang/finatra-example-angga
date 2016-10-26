package finatra.example.module

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.marshalling.MessageBodyReader
import finatra.example.domain.CustomRequest

/**
 * Created by zkidkid on 10/26/16.
 */
class CustomBodyReader extends MessageBodyReader[CustomRequest]{
  override def parse(request: Request): CustomRequest = {
    return CustomRequest("x")
  }
}
