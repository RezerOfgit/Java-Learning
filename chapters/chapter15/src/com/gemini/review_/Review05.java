package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review05 {
    /*
    题目： 已知 Dog extends Animal。
    如果你拿到了一个 List<? extends Animal> list (上界通配符)，
    以下哪种操作是合法且安全的？B

A. list.add(new Dog()) —— 我觉得它既然是 Animal 的子类，肯定能放进去。
B. Animal a = list.get(0) —— 编译器能保证取出来的东西，至少是个 Animal。
C. Dog d = list.get(0) —— 编译器能保证取出来的东西，一定是个 Dog。
     */
}
