package com.hspedu.homework.h02;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Frock {
    private static int currentNum = 100000;//衣服出厂的序列号起始值
    private int serialNumber;

    public static int getNextNum() {
        return currentNum += 100;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        serialNumber = getNextNum();
    }
}
