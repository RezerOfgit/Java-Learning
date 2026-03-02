package com.gemini.task;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task03Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket(InetAddress.getLocalHost(), 9999)) {
            final OutputStream outputStream = socket.getOutputStream();
            outputStream.write("Hello Server! 我是特种兵客户端！".getBytes());
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
