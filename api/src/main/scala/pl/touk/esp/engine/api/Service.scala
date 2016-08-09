package pl.touk.esp.engine.api

import scala.concurrent.{ExecutionContext, Future}

trait Service {

  def invoke(params: Map[String, Any])
            (implicit ec: ExecutionContext): Future[Any]

}