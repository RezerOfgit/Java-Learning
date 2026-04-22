package com.gemini.task;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task05Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(9999)) {
            System.out.println("服务端在9999端口监听....");
            final Socket socket = serverSocket.accept();

            final BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());

            String destFilePath = "D:\\Java_IO_Base\\test_upload.jpg";
            final BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = bis.read(buf)) != -1) {
                bos.write(buf, 0, len);
            }
            bos.close();

            final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("收到图片");
            bw.newLine();
            bw.flush();
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
