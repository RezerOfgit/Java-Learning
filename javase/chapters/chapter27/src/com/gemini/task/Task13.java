package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task13 {
    public static void main(String[] args) {
        String data = "hello#world-java~regex233spring";
        String[] split = data.split("#|-|~|\\d+");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
