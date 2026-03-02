package com.gemini.task;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task01 {
    public static void main(String[] args) throws UnknownHostException {
        //1. 电脑的名字和局域网 IP
        final InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        //2. 获取百度的 InetAddress 对象，并打印出来
        final InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);

        //3. 解剖对象：拿到百度的对象后，分别调用它的 .getHostName()（获取主机名）
        // 和 .getHostAddress()（获取真实的 IP 字符串），打印出来。
        final String hostName = byName.getHostName();
        final String hostAddress = byName.getHostAddress();
        System.out.println("百度的主机名" + hostName + " , ip=" + hostAddress);

    }
}
