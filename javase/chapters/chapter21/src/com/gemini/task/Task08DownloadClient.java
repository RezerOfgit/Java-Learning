package com.gemini.task;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Task08DownloadClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket(InetAddress.getLocalHost(), 6666)) {
            String downloadFileName = "qiao.png";
            final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write(downloadFileName);

            bufferedWriter.newLine();
            bufferedWriter.flush();

            String filePath = "D:\\Java_IO_Base\\download_qiao.png";
            final BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));

            final BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());

            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = bis.read(buf)) != -1) {
                bos.write(buf, 0, len);
            }
            bos.flush();
            socket.shutdownOutput();
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
