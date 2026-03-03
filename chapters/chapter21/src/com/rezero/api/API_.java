package com.rezero.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Re-zero
 * @version 1.0
 * 演示InetAddress 类的使用
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //1. 获取本机的InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//DESKTOP-O4LV3FV/192.168.71.105

        //2. 根据指定主机名 获取 InetAddress对象
        final InetAddress host01 = InetAddress.getByName("DESKTOP-O4LV3FV");
        System.out.println("host01 = " + host01);//host01 = DESKTOP-O4LV3FV/192.168.71.105

        //3. 根据域名返回 InetAddress对象，比如 www.baidu.com 对应
        final InetAddress host02 = InetAddress.getByName("www.baidu.com");
        System.out.println("host02 = " + host02);//host02 = www.baidu.com/183.2.172.17

        //4. 通过 InetAddress 对象，获取对应的地址
        final String hostAddress = host02.getHostAddress();//IP 183.2.172.17
        System.out.println("host02 对应的ip " + hostAddress);

        //5. 通过 InetAddress 对象，获取对应的主机名/或者的域名
        final String hostName = host02.getHostName();
        System.out.println("host02对应的主机名/域名 = " + hostName);//www.baidu.com
    }
}
