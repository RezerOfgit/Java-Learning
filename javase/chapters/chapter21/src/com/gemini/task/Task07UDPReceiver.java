package com.gemini.task;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task07UDPReceiver {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(7777)) {
            final byte[] buf = new byte[1024];

            final DatagramPacket packet = new DatagramPacket(buf, buf.length);

            socket.receive(packet);

            final int length = packet.getLength();
            final byte[] data = packet.getData();

            final String s = new String(data, 0, length);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
