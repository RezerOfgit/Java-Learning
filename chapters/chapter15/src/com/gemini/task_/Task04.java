package com.gemini.task_;

/**
 * @author Re-zero
 * @version 1.0
 */
// 1. 在类名后面声明泛型 <T>
class Box<T> {
    // 2. 内部的属性也可以用 T 类型
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class Task04 {
    public static void main(String[] args) {
        // 3. 创建一个专门装 String 的盒子
        Box<String> box1 = new Box<>();
        box1.setContent("Apple");
        // box1.setContent(123); // 这一行会报错，因为已经定死是 String 了

        System.out.println(box1.getContent());
    }
}
