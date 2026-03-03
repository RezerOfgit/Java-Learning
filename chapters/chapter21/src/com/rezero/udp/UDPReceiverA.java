package com.rezero.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author Re-zero
 * @version 1.0
 * UDP接收端
 */
public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1. 创建一个 DatagramSocket 对象，准备在9999接收数据
        final DatagramSocket socket = new DatagramSocket(9999);

        //2. 构建一个 DatagramPacket 对象，准备接收数据
        //在前面讲解UDP 协议时，老师说过一个数据包最大 64k
        byte[] buf = new byte[1024];
        final DatagramPacket packet = new DatagramPacket(buf, buf.length);

        //3. 调用 接收方法，将通过网络传输的 DatagramPacket 对象
        //填充到 packet对象
        //提示：当有数据包发送到 本机的9999端口时, 就会接收到数据
        // 如果没有数据包发送到 本机的9999端口, 就会阻塞等待.
        System.out.println("接收端A 等待接收数据...");
        socket.receive(packet);

        //4. 可以把packet 进行拆包，取出数据，并显示.
        int length = packet.getLength();//实际接收到的数据字节长度
        byte[] data = packet.getData();//接收到数据
        final String s = new String(data, 0, length);
        System.out.println(s);

        //5. 关闭资源
        socket.close();
        System.out.println("A端退出...");

    }
}
