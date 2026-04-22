package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task11 {
    /*
    请补全源码级的操作逻辑（画图想象一下）： 我们要让 A 直接牵手 C，
    C 直接牵手 A，从而把 B 架空。

    // 假设 current 指向 NodeB
    // current.prev 指向 NodeA
    // current.next 指向 NodeC

    // 1. 让 A 的 next 直接指向 C
    current.prev.next = NodeC;

    // 2. 让 C 的 prev 直接指向 A
    current.next.prev = NodeA;

    // 3. 把 B 的手脚打断 (可选，为了GC)
    current.prev = null;
    current.next = null;

     */
}
