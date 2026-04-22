package com.gemini.task;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task05Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket(InetAddress.getLocalHost(), 9999)) {
            String filePath = "D:\\Java_IO_Base\\test.jpg";
            final BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));

            final BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
            byte[] buf = new byte[1024];
            int len;
            while ((len = bis.read(buf)) != -1) {
                bos.write(buf, 0, len);
            }
            bis.close();
            bos.flush();
            socket.shutdownOutput();

            final InputStream inputStream = socket.getInputStream();
            final BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            final String s = br.readLine();
            System.out.println(s);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
