package com.rezero.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Re-zero
 * @version 1.0
 */
//切面类
@Slf4j
@Component
//@Aspect
public class MyAspect7 {
    //匹配DeptServiceImpl中的 list() 和 delete(Integer id)方法
//    @Pointcut("execution(* com.rezero.service.DeptService.list()) || execution(* com.rezero.service.DeptService.delete(java.lang.Integer))")
    @Pointcut("@annotation(com.rezero.anno.MyLog)")
    private void pt(){}

    @Before("pt()")
    public void before(){
        log.info("MyAspect7 ... before ...");
    }
}
