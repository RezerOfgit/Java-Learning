package com.hspedu.gemini_;

/**
 * @author Re-zero
 * @version 1.0
 */
interface USB {
    void work();
}

public class Test {
    public static void main(String[] args) {
        // 要求：使用匿名内部类，打印 "USB转啊转"
            USB u = new USB() {
                @Override
                public void work() {
                    System.out.println("USB转啊转");
                }
            };
        u.work();
    }
}