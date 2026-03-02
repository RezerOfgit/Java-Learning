package com.rezero.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Re-zero
 * @version 1.0
 * 客户端，发送"hello，server"给服务端
 */
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        //思路
        //1. 连接服务端(ip, 端口)
        final Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回 = " + socket.getClass());

        //2. 连接上后，生成Socket，通过socket.getOutputStream()
        //   得到 和 socket对象关联的输出流对象
        final OutputStream outputStream = socket.getOutputStream();

        //3. 通过输出流，写入数据到 数据通道
        outputStream.write("hello server".getBytes());
        //4. 关闭流对象和socket，必须关闭
        outputStream.close();
        socket.close();
        System.out.println("客户端退出....");


    }
}
