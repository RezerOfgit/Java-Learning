package com.rezero.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework01Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket(InetAddress.getLocalHost(), 9999)) {

            final OutputStream outputStream = socket.getOutputStream();

            final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
            bw.write("客户端询问name:");
            bw.newLine();
            bw.flush();

            final InputStream inputStream = socket.getInputStream();
            final BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String s = br.readLine();
            System.out.println(s);

            bw.write("客户端询问hobby:");
            bw.newLine();
            bw.flush();
            s = br.readLine();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
