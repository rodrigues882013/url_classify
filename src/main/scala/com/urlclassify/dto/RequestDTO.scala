package com.urlclassify.dto

import scala.beans.BeanProperty

case class RequestDTO(@BeanProperty var url: String) extends Serializable
