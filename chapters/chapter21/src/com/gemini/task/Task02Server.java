package com.gemini.task;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task02Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(9999)) {
            System.out.println("服务端已启动，正在 9999 端口等待连接...");
            final Socket socket = serverSocket.accept();
            System.out.println("有客户端连接成功!");

            final InputStream inputStream = socket.getInputStream();

            final byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = inputStream.read(buf)) != -1) {
                System.out.println(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
