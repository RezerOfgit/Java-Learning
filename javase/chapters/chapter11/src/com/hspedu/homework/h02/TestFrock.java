package com.hspedu.homework.h02;

/**
 * @author Re-zero
 * @version 1.0
 */
public class TestFrock {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());

        Frock[] frocks = new Frock[3];
        for (int i = 0; i < frocks.length; i++) {
            frocks[i] = new Frock();
        }
        for (Frock frock : frocks) {
            System.out.println(frock.getSerialNumber());
        }
    }
}
