package com.atguigu.springcloud.testdemo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    public String test(){
        return "test";
    }
}
