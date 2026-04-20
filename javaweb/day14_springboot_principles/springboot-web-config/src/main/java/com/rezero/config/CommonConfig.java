package com.rezero.config;

import com.rezero.service.DeptService;
import org.dom4j.io.SAXReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Re-zero
 * @version 1.0
 */
@Configuration //配置类
public class CommonConfig {

    //声明第三方bean
    @Bean //将当前方法的返回值对象交给IOC容器管理, 成为IOC容器bean
          //通过@Bean注解的name/value属性指定bean名称, 如果未指定, 默认是方法名
//    public SAXReader reader() {
//            return new SAXReader();
//}
    // 如果需要依赖注入, 直接指定对应的方法形参即可
    public SAXReader reader(DeptService deptService) {
        System.out.println(deptService);
        return new SAXReader();
    }
}
