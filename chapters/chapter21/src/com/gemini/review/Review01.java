package com.gemini.review;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Re-zero
 * @version 1.0
 * 你的前端同事小王想用 Java 查一下 www.github.com 的真实 IP 地址。
 * 但他搞混了代码和命令行的区别。
 * 问题：
 * 请写出获取该网址 IP 字符串的核心 Java 代码。
 * 小王问：“这段 Java 代码是不是在底层向 GitHub 发送了 Ping (ICMP) 数据包？”
 * 请用今天学的原理解释给他听。
 */
public class Review01 {
    public static void main(String[] args) throws UnknownHostException {

        final InetAddress byName = InetAddress.getByName("www.github.com");

        final String hostAddress = byName.getHostAddress();
        System.out.println("github 的 ip = " + hostAddress);
        /*
         * 小王问：“这段 Java 代码是不是在底层向 GitHub 发送了 Ping (ICMP) 数据包？”
         * 请用今天学的原理解释给他听。
         * Java 代码 (`getByName`)**：它做的事情仅仅是 **DNS 域名解析**。并没有发送数据包
         */
    }
}
