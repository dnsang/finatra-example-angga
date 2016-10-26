package finatra.example.domain

import com.twitter.finatra.request.{QueryParam, RouteParam}

/**
 * Created by zkidkid on 10/26/16.
 */
case class SimpleRequest(
  @RouteParam id: Long,
  @QueryParam name: String
)