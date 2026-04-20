package com.gemini;

/**
 * @author Re-zero
 * @version 1.0
 * 场景：又有一个新同事引入了你的 Starter，但他是个马大哈，完全忘记在 application.yml 里写 alert.robot.token 了。
 * 问题：当他启动项目并尝试 @Autowired private AlertService alertService; 时，会发生什么报错？这是由你配置类里的哪个注解精准拦截的？
 */
public class Review02 {

    /*
    当同事忘记配置 alert.robot.token 时，启动项目并尝试 @Autowired private AlertService alertService; 会抛出 NoSuchBeanDefinitionException，错误信息类似：No qualifying bean of type 'com.example.alert.service.AlertService' available。

这是因为你的自动配置类上标注了 @ConditionalOnProperty(prefix = "alert.robot", name = "token")，该注解会检查配置文件中是否存在 alert.robot.token 属性。由于缺失该配置，条件不满足，整个 AlertAutoConfiguration 类不会被 Spring 加载，因此 AlertService 的 Bean 也不会被注册。最终导致依赖注入失败，精准拦截了装配过程。
     */
}
