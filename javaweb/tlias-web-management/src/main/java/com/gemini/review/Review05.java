package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 * 场景：在项目重构中，老板要求对所有的 Service 层的更新操作（也就是以 update
 * 开头的方法）单独做一个耗时监控。
 * 任务：请写出对应的 execution 切入点表达式。拦截 com.rezero.service 包
 * 及其所有子包下，所有以 update 开头的方法，不论参数和返回值是什么。
 */
public class Review05 {
//    @Around("execution(* com.rezero.service..*.update*(..))")
}
