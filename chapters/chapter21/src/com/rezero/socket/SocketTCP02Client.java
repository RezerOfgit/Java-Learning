package com.rezero.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Re-zero
 * @version 1.0
 * 客户端，发送"hello,server"给服务端然后再接收服务端的信息
 */
@SuppressWarnings({"all"})
public class SocketTCP02Client {
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
        //  设置结束标记
        socket.shutdownOutput();

        //4. 获取和socket关联的输入流。读取数据（字节），并显示
        final InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));//根据读取到的实际长度，显示内容。
        }

        //4. 关闭流对象和socket，必须关闭
        outputStream.close();
        inputStream.close();
        socket.close();
        System.out.println("客户端退出....");


    }
}
