package com.hspedu.homework.h04;

import javafx.scene.control.Cell;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Calculator() {
            @Override
            public void work(int n1, int n2) {
                System.out.println("运算结果 = " + (n1 +n2));
            }
        }, 10, 20);
    }
}
