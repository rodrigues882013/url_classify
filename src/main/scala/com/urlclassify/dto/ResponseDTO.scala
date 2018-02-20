package com.urlclassify.dto

import scala.beans.BeanProperty
import com.urlclassify.model.Category

case class Internal(@BeanProperty var categories: List[Category],
                    @BeanProperty var url: String) extends Serializable

case class ResponseDTO(@BeanProperty var data: List[Internal]) extends Serializable
