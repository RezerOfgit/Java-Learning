package com.rezero.springbootwebquickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Re-zero
 * @version 1.0
 */
//请求处理类
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello World!");
        return "Hello World!";
    }
}
