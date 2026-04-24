package com.rezero.jedis.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.time.Duration;

/**
 * @author Re-zero
 * @version 1.0
 */
public class JedisConnectionFactory {
    private static final JedisPool jedisPool;

    static {
        //配置连接池
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(8);
        poolConfig.setMaxIdle(8); // 最大空闲连接数：8
        poolConfig.setMinIdle(0); // 最小空闲连接数：0  (一般写成 0 或 2)
        poolConfig.setMaxWait(Duration.ofSeconds(1));
//        poolConfig.setMaxWaitMillis(1000);// 获取连接最大等待时间，单位毫秒, 过时方法
        //创建连接池对象
        jedisPool = new JedisPool(poolConfig, "localhost", 6379,
                1000);
    }

    public static Jedis getJedis() {
        return jedisPool.getResource();
    }
}
