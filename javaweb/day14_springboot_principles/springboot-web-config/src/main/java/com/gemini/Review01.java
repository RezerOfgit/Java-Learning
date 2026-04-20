package com.gemini;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review01 {
    /*
    场景：另一个同事在他的项目里引入了你写的 alert-spring-boot-starter。
    但是，他觉得你的 send 方法打印的格式不好看，于是他在自己的项目里，
    自己写了一个 @Bean public AlertService myAlertService() { ... }。
    同时，他在 yml 里配置了正确的 token。
问题：当他的项目启动时，Spring 容器里最终会有几个 AlertService？
会用你的还是他的？这一切是依靠你代码里的哪一句“魔法咒语”实现的？

最终 Spring 容器中只有 1 个 AlertService，即同事自己写的那个。
会使用同事自定义的 AlertService。
这一切依靠你代码中的 @ConditionalOnMissingBean 这一句“魔法咒语”。
它的作用是：只有当容器中不存在 AlertService 类型的 Bean 时，才会自动配置你提供的默认实现；
如果用户已经手动定义了自己的 AlertService，则自动配置的 Bean 不会被注册，
从而避免冲突并尊重用户的自定义行为。
     */
}
