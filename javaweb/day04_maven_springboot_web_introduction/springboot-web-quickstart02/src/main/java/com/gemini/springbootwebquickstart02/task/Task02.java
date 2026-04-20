package com.gemini.springbootwebquickstart02.task;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Re-zero
 * @version 1.0
 */
//请求处理类
@RestController
public class Task02 {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello Spring Boot, 我是后端架构师!");
        return "Hello Spring Boot, 我是后端架构师!";
    }
}
/*
Task02: (P58-P59) Spring Boot “Hello World” 破冰战
【任务背景】：写出你人生中第一个能提供 HTTP 接口的纯后端服务！

【具体要求】：

跟着视频，在 IDEA 中使用 Spring Initializr（或者阿里云脚手架 https://start.aliyun.com）创建一个 Spring Boot 工程。
引入 Spring Web 依赖。
创建一个 Controller 类（比如叫 HelloController）。
写一个方法，打上 @RestController 和 @RequestMapping("/hello") 注解，让它返回一段字符串："Hello Spring Boot, 我是后端架构师!"
启动 Spring Boot（看到控制台打印出漂亮的 Spring 字符画，且 Tomcat started on port 8080）。
打开浏览器，地址栏输入 http://localhost:8080/hello，见证奇迹！
 */

