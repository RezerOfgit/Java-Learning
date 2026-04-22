package com.gemini.supplement_;

import java.util.HashSet;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Supplement04 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Dog("旺财")); // 第一只
        set.add(new Dog("来福")); // 第二只
        System.out.println("断点");
    }
}
class Dog {
    String name;
    public Dog(String name) { this.name = name; }

    // 🔴 故意重写 hashCode，让所有狗的哈希值都一样！
    @Override
    public int hashCode() { return 100; }

    // 不重写 equals，所以默认比较地址，肯定是 false
}
