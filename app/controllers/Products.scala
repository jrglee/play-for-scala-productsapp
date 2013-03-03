package controllers

import play.api.mvc.{Action, Controller}

object Products extends Controller {
  def list = Action { implicit request =>
    val products = models.Product.findAll

    Ok(views.html.products.list(products))
  }
}