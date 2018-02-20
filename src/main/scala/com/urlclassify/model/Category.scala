package com.urlclassify.model

import scala.beans.BeanProperty


case class Category(@BeanProperty var id: Option[String],
                    @BeanProperty var label: Option[String],
                    @BeanProperty var parent: Option[String],
                    @BeanProperty var score: Double,
                    @BeanProperty var confident: Boolean) extends Serializable
