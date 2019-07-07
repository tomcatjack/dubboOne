package com.debug.mooc.dubbo.one.server.controller;

import com.debug.mooc.dubbo.one.api.enums.StatusCode;
import com.debug.mooc.dubbo.one.api.response.BaseResponse;
import com.debug.mooc.dubbo.one.server.service.dubbo.DubboItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @sum ：
 * @description：
 * @date ：Created in 2019/7/2
 */
@RestController
public class BaseController {

  private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

  @Autowired
  DubboItemService dubboItemService;

  @RequestMapping("/test")
  public BaseResponse test(@RequestParam String param){
    BaseResponse baseResponse = new BaseResponse(StatusCode.Success.getCode(),param);
    BaseResponse baseResponse1 = dubboItemService.listItems();
    return baseResponse1;
  }

}
