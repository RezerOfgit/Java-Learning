package com.rezero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@ComponentScan({"dao","com.rezero"})
//@SpringBootApplication // 默认扫描当前包及其子包
//如果包位置有变动, 可以改成上面的形式, 不推荐
@SpringBootApplication // 默认扫描当前包及其子包
public class SpringbootWebReqRespApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebReqRespApplication.class, args);
    }

}
