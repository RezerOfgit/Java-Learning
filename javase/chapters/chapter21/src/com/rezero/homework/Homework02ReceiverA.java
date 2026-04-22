package com.rezero.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework02ReceiverA {
    public static void main(String[] args) throws IOException {
        final DatagramSocket socket = new DatagramSocket(8888);

        final byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

        System.out.println("接收端A 等待接收数据...");
        socket.receive(packet);

        String question = "四大名著是哪些";
        //可以把packet 进行拆包，取出数据，并显示.
        int length = packet.getLength();//实际接收到的数据字节长度
        byte[] data = packet.getData();//接收到数据
        final String s = new String(data, 0, length);
        System.out.println(s);

        if (s.equals(question)) {
            String answer = "四大名著是<红楼梦><西游记><水浒传><三国演义>";

            data = answer.getBytes();
            packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.91.105"), 8887);
            socket.send(packet);
        }else {
            String answer = "what?";

            data = answer.getBytes();
            packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.91.105"), 8887);
            socket.send(packet);
        }

        socket.close();
        System.out.println("A端退出...");
    }
}
