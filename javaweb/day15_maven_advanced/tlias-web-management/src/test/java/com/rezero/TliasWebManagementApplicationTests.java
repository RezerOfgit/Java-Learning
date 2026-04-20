package com.rezero;

import com.rezero.pojo.Dept;
import com.rezero.service.DeptService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class TliasWebManagementApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testUuid() {
        for (int i = 0; i < 1000; i++) {
            String uuid = UUID.randomUUID().toString();
            System.out.println(uuid);
        }
    }

    /**
     * 生成JWT
     */
    @Test
    public void testGenJwt(){
        Map<String, Object> claims = new HashMap<>();
        claims.put("id",1);
        claims.put("name","tom");

        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, "rezero")//签名算法
                .setClaims(claims) //自定义内容(载荷)
                .setExpiration(new Date(System.currentTimeMillis() + 3600 * 1000))//设置有效期为1h
                .compact();
        System.out.println(jwt);
    }

    /**
     * 解析JWT
     */
    @Test
    public void testParseJwt(){
        Claims claims = Jwts.parser()
                .setSigningKey("rezero")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoidG9tIiwiaWQiOjEsImV4cCI6MTc3NjY3ODMxN30.yU1RuVMhKW3MRTESjAI-vTKd8sucXWC9YeCNUpvLIqM")
                .getBody();
        System.out.println(claims);
    }

    @Autowired
    private DeptService deptService;

    @Test
    public void testAopDelete() throws Exception {
        deptService.delete(10);
    }

    @Test
    public void testAopList(){
        List<Dept> list = deptService.list();
        System.out.println(list);
    }

    @Test
    public void testAopGetById(){
        Dept dept = deptService.getById(1);
        System.out.println(dept);
    }
}
