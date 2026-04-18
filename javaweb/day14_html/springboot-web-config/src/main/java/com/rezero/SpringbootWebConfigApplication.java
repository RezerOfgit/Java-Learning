package com.rezero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootWebConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebConfigApplication.class, args);
    }

//    //声明第三方bean
//    @Bean //将当前方法的返回值对象交给IOC容器管理, 成为IOC容器bean
//    public SAXReader saxReader() {
//        return new SAXReader();
//    }

}
