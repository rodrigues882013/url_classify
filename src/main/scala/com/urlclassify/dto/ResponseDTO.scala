package com.urlclassify.dto

import scala.beans.BeanProperty
import com.urlclassify.model.Category


case class ResponseDTO(@BeanProperty var data: Seq[Category]) extends Serializable
