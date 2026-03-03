package com.rezero.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Re-zero
 * @version 1.0
 * 服务端, 接收字符流信息后再发送"hello,client"给客户端
 */
@SuppressWarnings({"all"})
public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        //思路
        //1. 在本机的9999端口监听，等待连接
        //  细节：要求在本机没有其它服务在监听9999
        //  细节：这个 ServerSocket 可以通过 accept() 返回多个Socket[多个客户端连接服务器的并发]
        final ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端, 在9999端口监听, 等待连接...");

        //2. 当没有客户端连接9999端口时，程序会阻塞，等待连接
        //   如果有客户端连接，则会返回Socket对象，程序继续
        final Socket socket = serverSocket.accept();
        System.out.println("socket = " + socket.getClass());
        //3. 通过socket.getInputStream()读取客户端写入到数据通道的数据，显示
        final InputStream inputStream = socket.getInputStream();
        //4. IO读取, 使用字符流，使用 InputStreamReader 将 inputStream 转成字符流
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        final String s = bufferedReader.readLine();
        System.out.println(s);//输出

        //5. 获取socket相关联的输出流
        final OutputStream outputStream = socket.getOutputStream();
        // 使用字符输出流的方式回复信息
        final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello client 字符流");
        bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束，注意，要求对方使用readLine(！！！)
        bufferedWriter.flush();//注意需要手动的flush

        //6. 关闭流和socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();//关闭
        System.out.println("服务端退出....");

    }
}
