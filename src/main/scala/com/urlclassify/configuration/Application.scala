package com.urlclassify.configuration

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(scanBasePackages = Array("com.urlclassify"))
class Application

object Application extends App {
	SpringApplication.run(classOf[Application])
}
