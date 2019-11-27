package com.king.gmall.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/11/26.
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String sayHello(){
        return "hello springboot";
    }
}
