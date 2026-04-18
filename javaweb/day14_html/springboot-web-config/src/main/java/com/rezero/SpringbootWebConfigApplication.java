package com.rezero;

import com.rezeroutils.EnableHeaderConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan({"com.rezero", "com.rezeroutils"})
//@Import(TokenParser.class) //导入普通类, 交给Ioc容器管理
//@Import(HeaderConfig.class) //导入普通类, 交给Ioc容器管理
//@Import({MyImportSelector.class}) //导入ImportSelector接口实现类

@EnableHeaderConfig
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
