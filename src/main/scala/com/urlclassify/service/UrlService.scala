package com.urlclassify.service

import java.nio.charset.StandardCharsets
import java.util.Base64

import com.urlclassify.dto.ResponseDTO
import org.springframework.beans.factory.annotation.{Autowired, Value}
import org.springframework.http._
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class UrlService(@Value("${service.url}") var urlService: String,
                 @Value("${service.key}") var key: String,
                 @Autowired restTemplate: RestTemplate) {

  def getClassify(url: String): ResponseEntity[ResponseDTO] = {
    val _url: String = configUrl(url)
    restTemplate.exchange(_url, HttpMethod.GET, configHeader(), classOf[ResponseDTO])
  }

  def configUrl(url: String): String =
    "%s/%s".format(urlService, Base64.getEncoder.encodeToString(url.getBytes(StandardCharsets.UTF_8)))

  def configHeader(): HttpEntity[String] = {
    val headers = new HttpHeaders
    headers.set("Authorization", "Basic %s".format(Base64.getEncoder.encodeToString(key.getBytes(StandardCharsets.UTF_8))))
    new HttpEntity[String]("parameters", headers)
  }
}
