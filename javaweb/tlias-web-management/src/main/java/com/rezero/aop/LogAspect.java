package com.rezero.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Re-zero
 * @version 1.0
 */
@Component
@Aspect
@Slf4j
public class LogAspect {

    @Before("@annotation(com.rezero.aop.LogAction)")
    public void beforeLog(JoinPoint joinPoint) {
        joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        log.info(Arrays.toString(args));
    }
}
