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
public class Task04Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket(InetAddress.getLocalHost(), 8888)) {
            final OutputStream outputStream = socket.getOutputStream();

            final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            bufferedWriter.write("Hello Server，我是 Client 字符流特种兵。");
            bufferedWriter.newLine();
            bufferedWriter.flush();

            final InputStream inputStream = socket.getInputStream();
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            final String s = bufferedReader.readLine();
            System.out.println(s);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
