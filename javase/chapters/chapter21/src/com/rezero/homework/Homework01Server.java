package com.rezero.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework01Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(9999)) {
            System.out.println("服务端，在9999端口监听，等待连接...");
            final Socket socket = serverSocket.accept();

            String name = "nova";
            String hobby = "编写java程序";

            final InputStream inputStream = socket.getInputStream();
            final BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String s = br.readLine();
            final OutputStream outputStream = socket.getOutputStream();
            final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
            System.out.println(s);

            if (!s.equals("客户端询问name:") && !s.equals("客户端询问hobby:")){
                bw.write("你说啥呢");
                bw.newLine();
                bw.flush();
            }else {

                bw.write("服务端回复: 我是 " + name);
                bw.newLine();
                bw.flush();

                s = br.readLine();
                System.out.println(s);

                bw.write("服务端回复: 爱好是 " + hobby);
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
