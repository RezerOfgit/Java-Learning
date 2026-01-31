package com.gemini.interface_;

public class InterfaceTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Mouse mouse = new Mouse();
        KeyBoard keyBoard = new KeyBoard();
        computer.plugin(mouse);
        computer.plugin(keyBoard);
    }
}
