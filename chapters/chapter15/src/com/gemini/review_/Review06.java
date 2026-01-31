package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review06 {
    /*
    现在我们在 main 方法里执行：Fish<String> fish = new Fish<>();
    (此时，类的 T 被确定为 String)

调用 fish.swim(val) 时，参数 val 必须是 String 类型。
调用 fish.eat(val) 时，参数 val 可以是 任意 类型（填“任意”或“必须是 String”）。
     */
    public static void main(String[] args) {
        class Fish<T> {
            // 方法 1: 使用类定义的泛型 T
            public void swim(T t) { }

            // 方法 2: 自定义了一个泛型 <T> (注意：它隐藏了类的 T，变成了独立的泛型)
            public <T> void eat(T t) { }
        }
    }
}
