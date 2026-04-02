package com.network_socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Re-zero
 * @version 1.0
 */
public class MicroTomcatTask {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket socket = serverSocket.accept();

            String str = "HTTP/1.1 200 OK\r\n\r\n<h1 style='color:green'>System Running...</h1>";
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(str.getBytes());

            outputStream.close();
            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
