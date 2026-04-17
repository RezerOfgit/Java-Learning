package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 * 场景：目前的 WebConfig 中，我们只排除了 /login 接口。假设现在的业务升级了，
 * 我们不仅需要排除登录，还需要排除注册接口（/register），以及所有的静态图片资源
 * （路径规律为 /images/任何文件名.png）。
 *
 * 任务：请写出 WebConfig 中 addInterceptors 方法内，
 * 关于 .excludePathPatterns(...) 的最新代码配置。
 */
public class Review02 {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(loginInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/login", "/register", "/images/**");
//    }
}
