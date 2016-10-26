package finatra.example.controller.http

import javax.inject.Singleton

import com.twitter.finatra.http.Controller
import finatra.example.domain.SimpleRequest


/**
 * Created by SangDang on 9/16/16.
 */

@Singleton
class SimpleRequestController extends Controller {
  get("/simple/:id") { request: SimpleRequest =>
    request
  }


}
