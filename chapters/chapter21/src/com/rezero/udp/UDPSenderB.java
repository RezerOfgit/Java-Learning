package com.rezero.udp;

import java.io.IOException;
import java.net.*;

/**
 * @author Re-zero
 * @version 1.0
 * UDP发送端
 */
public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //1. 创建 DatagramSocket 对象，准备在9998端口 接收数据
        final DatagramSocket socket = new DatagramSocket(9998);

        //2. 将需要发送的数据，封装到 DatagramPacket对象
        byte[] data = "hello 明天吃火锅~".getBytes();

        //说明：封装的 DatagramPacket对象 data 内容字节数组,data.length,主机(IP),端口
        final DatagramPacket packet =
                new DatagramPacket(data, data.length, InetAddress.getByName("192.168.91.105"), 9999);
        socket.send(packet);

        //关闭资源
        socket.close();
        System.out.println("B端退出...");
    }
}
