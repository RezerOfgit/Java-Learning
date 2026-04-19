package com.rezeroalter;

/**
 * @author Re-zero
 * @version 1.0
 */
public class AlertService {
    private final AlertProperties properties;

    public AlertService(AlertProperties properties) {
        this.properties = properties;
    }

    public void send(String msg) {
        System.out.println("【" + properties.getName() + "报警】发送消息: " + msg + ", token: " + properties.getToken());
    }
}