package com.rezero.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Re-zero
 * @version 1.0
 */
@Component
//@Aspect
@Slf4j
public class LogAspect {

    @Before("@annotation(com.rezero.aop.LogAction)")
    public void beforeLog(JoinPoint joinPoint) {

        String methodName = joinPoint.getSignature().getName();
        log.info("目标方法的方法名: {}",methodName);

        Object[] args = joinPoint.getArgs();
        log.info("目标方法运行时传入的参数: {}", Arrays.toString(args));
    }
}
