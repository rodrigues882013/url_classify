package com.urlclassify.controller

import com.urlclassify.dto.{RequestDTO, ResponseDTO}
import com.urlclassify.service.UrlService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.{PostMapping, RequestBody, RequestMapping, RestController}

@RestController
@RequestMapping(value = Array("/api/v1"))
class UrlController (@Autowired val urlService: UrlService) {

  @PostMapping(path=Array("/classify"))
  def getClassification(@RequestBody body: RequestDTO): ResponseEntity[ResponseDTO] =
    urlService.getClassify(body.url)
}
