package com.urlclassify.configuration

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.{Bean, ComponentScan, Configuration}
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import com.fasterxml.jackson.module.scala.DefaultScalaModule


@Configuration
@EnableAutoConfiguration
@ComponentScan
class AppConfig extends WebMvcConfigurerAdapter {

  override def configureMessageConverters(converters: java.util.List[HttpMessageConverter[_]]) {
    def mapper: ObjectMapper = createObjectMapper
    mapper.registerModule(new DefaultScalaModule)

    def converter = createJacksonHttpMessageConverter
    converter.setObjectMapper(mapper)

    converters.add(converter)
  }

  @Bean
  def createJacksonHttpMessageConverter = new MappingJackson2HttpMessageConverter

  @Bean
  def createObjectMapper = new ObjectMapper
}