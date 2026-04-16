package com.rezero.controller;

import com.rezero.pojo.Emp;
import com.rezero.pojo.Result;
import com.rezero.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Re-zero
 * @version 1.0
 */
@Slf4j
@RestController
public class LoginController {

    @Autowired
    private EmpService empService;

    @PostMapping("/login")
    public Result login(@RequestBody Emp emp) {
        log.info("员工登录: {}", emp);
        Emp e = empService.login(emp);
        return e != null ? Result.success() : Result.error("用户名或密码错误");
    }

}
