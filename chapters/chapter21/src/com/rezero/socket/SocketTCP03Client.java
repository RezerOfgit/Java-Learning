package com.rezero.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Re-zero
 * @version 1.0
 * 客户端，发送"hello,server"给服务端然后再接收服务端的字符流信息
 */
@SuppressWarnings({"all"})
public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        //思路
        //1. 连接服务端(ip, 端口)
        final Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回 = " + socket.getClass());

        //2. 连接上后，生成Socket，通过socket.getOutputStream()
        //   得到 和 socket对象关联的输出流对象
        final OutputStream outputStream = socket.getOutputStream();

        //3. 通过输出流，写入数据到 数据通道, 使用字符流
        final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello server 字符流");
        bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束，注意，要求对方使用readLine(！！！)
        bufferedWriter.flush();//如果使用的字符流，需要手动刷新，否则数据不会写入数据通道

        //4. 获取和socket关联的输入流。读取数据(字符)，并显示
        final InputStream inputStream = socket.getInputStream();

        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        final String s = bufferedReader.readLine();
        System.out.println(s);

        //4. 关闭流对象和socket，必须关闭
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端退出....");


    }
}
