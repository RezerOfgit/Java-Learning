package com.rezero.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Re-zero
 * @version 1.0
 */
@Slf4j
@Component
//@Aspect
public class MyAspect2 {

    @Before("execution(* com.rezero.service.impl.DeptServiceImpl.*(..))")
    public void before() {
        log.info("before...2");
    }


    @After("execution(* com.rezero.service.impl.DeptServiceImpl.*(..))")
    public void after() {
        log.info("after...2");
    }
}
