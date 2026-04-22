package com.rezero.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework02SenderB {
    public static void main(String[] args) throws IOException {
        final DatagramSocket socket = new DatagramSocket(8887);

        String question = "四大名著是哪些";
        byte[] data = question.getBytes();
        DatagramPacket packet =
                new DatagramPacket(data, data.length, InetAddress.getByName("192.168.91.105"), 8888);
        socket.send(packet);

        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);

        System.out.println("发送端B 等待接收数据...");
        socket.receive(packet);

        int length = packet.getLength();//实际接收到的数据字节长度
        data = packet.getData();//接收到数据
        final String s = new String(data, 0, length);
        System.out.println(s);

        socket.close();
        System.out.println("B端退出...");
    }
}
