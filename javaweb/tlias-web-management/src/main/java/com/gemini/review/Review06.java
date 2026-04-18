package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 * 场景：就拿你刚刚手敲的 LogAspect 操作日志代码为例。
 *
 * 任务：请指出在这段代码中，以下 AOP 的四个核心专业术语分别对应了代码里的什么（只需简单指出即可）：
 *
 * 切面 (Aspect)：对应哪个类/注解？
 * 通知 (Advice)：对应哪个方法/注解？
 * 切入点 (Pointcut)：对应哪行代码/咒语？
 * 目标对象 (Target)：对应刚才实战中的什么东西？
 * 切面 (Aspect)：对应 LogAspect 类（使用了 @Aspect 注解）。
 */
public class Review06 {
    /*
    切面 (Aspect)：对应 LogAspect 类（使用了 @Aspect 注解）。

通知 (Advice)：对应 recordLog 方法（使用了 @Around 注解）。

切入点 (Pointcut)：对应 @annotation(com.rezero.anno.Log) 这一表达式（位于 @Around 注解中）。

目标对象 (Target)：对应被 @Log 注解标记的某个 Service 方法所在的 Spring Bean 对象（例如 DeptServiceImpl 的实例）。
     */
}
