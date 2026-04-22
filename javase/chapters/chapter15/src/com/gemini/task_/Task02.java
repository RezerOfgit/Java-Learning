package com.gemini.task_;

import java.util.ArrayList;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task02 {
    public static void main(String[] args) {
        // 1. 声明：这个 list 只能存 Dog
        // (JDK 7+ 这里的尖括号可以留空，叫“钻石语法”)
        ArrayList<Dog> list = new ArrayList<Dog>();

        list.add(new Dog());

        // 2. 再次尝试添加 Cat
        //list.add(new Cat());

        // 问：如果把上面这行 list.add(new Cat()) 的注释解开，
        // IDEA 会在什么时候报错？
        // A. 编译时（写代码时直接红线）
        // B. 运行时（跑起来才炸）

        // 3. 遍历
        for (Dog dog : list) { // 这里还需要写 Object 吗？
            System.out.println("安全地汪汪叫");
        }
    }
}
