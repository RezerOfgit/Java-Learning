package com.gemini.task;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Re-zero
 * @version 1.0
 * 创建 RequestController：写几个不同的方法，跑通以下三种最常用的参数接收方式
 * （必须手敲并用 Postman 测试成功）：
 *
 * 简单参数：前端传 name=张三&age=18，后端方法直接写 (String name, Integer age)。
 * JSON 参数（极其重要）：前端在请求体里发 JSON 字符串，后端必须建一个对应的实体类
 * （比如 User），并使用 @RequestBody 注解来接收。
 * 路径参数：前端请求 /users/100，后端使用 /users/{id} 和 @PathVariable 注解把 100抠出来。
 */
@RestController
public class Task01_RequestController {

    @RequestMapping("/simpleParam")
    public String simpleParam(String name, Integer age) {
        System.out.println(name + ":" + age);
        return name + ":" + age;
    }

    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user) {
        System.out.println(user);
        return "OK";
    }

    @RequestMapping("/users/{id}")
    public String usersParam(@PathVariable Integer id) {
        System.out.println(id);
        return "id OK";
    }
}
