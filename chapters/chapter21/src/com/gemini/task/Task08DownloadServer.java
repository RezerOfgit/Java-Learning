package com.gemini.task;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Task08DownloadServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(6666)) {
            System.out.println("服务端, 在6666端口监听, 等待中...");

            final Socket socket = serverSocket.accept();

            final InputStream inputStream = socket.getInputStream();
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            final String downLoadFileName = bufferedReader.readLine();
            System.out.println("客户端希望下载文件名=" + downLoadFileName);

            String resFilePath = "";
            if ("qiao.png".equals(downLoadFileName)) {
                resFilePath = "D:\\Java_IO_Base\\qiao.png";
            }else {
                resFilePath = "D:\\Java_IO_Base\\qiao02.png";
            }

            final BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resFilePath));

            final BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = bis.read(buf)) != -1) {
                bos.write(buf, 0, len);
            }
            bos.flush();
            socket.shutdownOutput();
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
