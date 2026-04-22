package com.gemini.interface2_;

public class FlyInterface {
    public static void main(String[] args) {
        Flyable[] flyables = new Flyable[2];
        flyables[0] = new Bird();
        flyables[1] = new Plane();
        for (int i = 0; i < flyables.length; i++) {
            flyables[i].fly();
        }
    }
}
