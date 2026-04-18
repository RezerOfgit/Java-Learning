package com.rezero;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rezeroutils.HeaderGenerator;
import com.rezeroutils.HeaderParser;
import com.rezeroutils.TokenParser;
import com.rezero.pojo.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * @author Re-zero
 * @version 1.0
 * 自动配置原理测试
 */
@SpringBootTest
public class AutoConfigurationTests {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testJson() throws JsonProcessingException {
        String json = objectMapper.writeValueAsString(Result.success());
        System.out.println(json);
    }

    @Autowired
    private ApplicationContext applicationContext;

    //获取TokenParser
    @Test
    public void testTokenParser() {
        System.out.println(applicationContext.getBean(TokenParser.class));
    }

    //获取HeaderParser
    @Test
    public void testHeaderParser() {
        System.out.println(applicationContext.getBean(HeaderParser.class));
    }

    //获取HeaderGenerator
    @Test
    public void testHeaderGenerator() {
        System.out.println(applicationContext.getBean(HeaderGenerator.class));
    }
}
