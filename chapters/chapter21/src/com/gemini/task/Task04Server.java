package com.gemini.task;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Task04Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            System.out.println("服务端, 在8888端口监听, 等待连接...");
            final Socket socket = serverSocket.accept();

            final InputStream inputStream = socket.getInputStream();
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            final String s = bufferedReader.readLine();
            System.out.println(s);

            final OutputStream outputStream = socket.getOutputStream();
            final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            bufferedWriter.write("收到！这里是 Server 服务端，使用字符流就是爽！");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
