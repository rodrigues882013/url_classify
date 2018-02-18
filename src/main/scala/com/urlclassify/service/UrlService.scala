package com.urlclassify.service

import com.urlclassify.dto.ResponseDTO
import org.springframework.http.{HttpHeaders, HttpStatus, ResponseEntity}
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class UrlService {

  def getClassify(url: String): ResponseEntity[ResponseDTO] = {
    val restTemplate: RestTemplate = new RestTemplate()
    val rb: ResponseDTO = restTemplate.getForObject(url, classOf[ResponseDTO])
    new ResponseEntity(rb, new HttpHeaders, HttpStatus.ACCEPTED)
  }
}
