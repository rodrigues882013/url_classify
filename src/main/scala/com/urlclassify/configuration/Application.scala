package com.urlclassify.configuration

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean

@SpringBootApplication(scanBasePackages = Array("com.urlclassify"))
class Application

object Application extends App {

	@Bean def restTemplate(builder: RestTemplateBuilder) = builder.build

	SpringApplication.run(classOf[Application])
}
