package finatra.example.controller.http

import javax.inject.Singleton

import com.twitter.finatra.http.Controller
import finatra.example.domain.CustomRequest


/**
 * Created by SangDang on 9/16/16.
 */

@Singleton
class CustomRequestController extends Controller {
  get("/custom") { request: CustomRequest =>
    response.ok(Map("data" -> request.data))
  }


}
