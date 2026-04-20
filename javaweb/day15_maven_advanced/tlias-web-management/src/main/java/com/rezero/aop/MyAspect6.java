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
public class MyAspect6 {

//    @Pointcut("execution(public void com.rezero.service.impl.DeptServiceImpl.delete(java.lang.Integer))")
//    @Pointcut("execution(void com.rezero.service.impl.DeptServiceImpl.delete(java.lang.Integer))")
//    @Pointcut("execution(void delete(java.lang.Integer))") //包名.类名不建议省略
//    @Pointcut("execution(void com.rezero.service.DeptService.delete(java.lang.Integer))")

//    @Pointcut("execution(void com.rezero.service.DeptService.*(java.lang.Integer))")
//    @Pointcut("execution(* com.*.service.DeptService.*(*))")
//    @Pointcut("execution(* com.rezero.service.*Service.delete*(*))")

//    @Pointcut("execution(* com.rezero.service.DeptService.*(..))")
//    @Pointcut("execution(* com..DeptService.*(..))")
//    @Pointcut("execution(* com..*.*(..))")
//    @Pointcut("execution(* *(..))") //慎用
@Pointcut("execution(* com.rezero.service.DeptService.list()) || " +
        "execution(* com.rezero.service.DeptService.delete(java.lang.Integer))")
    private void pt(){}

    @Before("pt()")
    public void before(){
        log.info("MyAspect6 ... before ...");
    }
}
