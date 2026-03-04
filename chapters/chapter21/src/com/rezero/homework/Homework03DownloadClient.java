package com.rezero.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author Re-zero
 * @version 1.0
 * 文件下载的客户端
 */
public class Homework03DownloadClient {
    public static void main(String[] args) throws Exception {

        //1. 接收用户输入，指定下载文件名
        final Scanner scanner = new Scanner(System.in);
        System.out.println("请输入下载文件名字");
        final String downloadFileName = scanner.next();

        //2. 客户端连接服务端，准备发送
        final Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //3. 获取和Socket关联的输出流
        final OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downloadFileName.getBytes());
        //设置写入结束的标志
        socket.shutdownOutput();

        //4. 读取服务端返回的文件（字节数据）
        final BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //5. 得到一个输出流，准备将 bytes 写入到磁盘文件
        // 比如你下载的是 高山流水 =>下载的就是 高山流水.mp3
        //你下载的是 hello =>下载的就是无名.mp3 文件名 hello.mp3
        String filePath = "d:\\" + downloadFileName + ".mp3";
        final BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);

        //6. 关闭相关的资源
        bos.close();
        bis.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端下载完毕，正确退出...");
    }
}
