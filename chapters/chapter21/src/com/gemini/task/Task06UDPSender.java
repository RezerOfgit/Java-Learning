package com.gemini.task;

import java.io.IOException;
import java.net.*;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task06UDPSender {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket()) {
            byte[] data = "SOS: 特种兵呼叫呼叫！".getBytes();
            final DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 7777);
            socket.send(packet);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
