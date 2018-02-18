package com.urlclassify.model

import scala.beans.BeanProperty


case class Category(@BeanProperty var id: Int, @BeanProperty var label: String,
                    @BeanProperty var parent: String, @BeanProperty var score: Double,
                    @BeanProperty var confident: Boolean) extends Serializable
