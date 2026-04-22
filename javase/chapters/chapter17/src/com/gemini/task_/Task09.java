package com.gemini.task_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task09 {
    /*
题目（判断对错）： 请判断以下 4 种情况，线程 是 (Yes) 否 (No) 会释放手中的锁？

情况 A：线程执行同步代码块时，遇到了 break 或 return 语句跑出去了。 -> (Yes / No)
Yes

情况 B：线程在同步代码块里调用了 Thread.sleep() 或 Thread.yield() 正在休息。 -> (Yes / No)
No

情况 C：线程在同步代码块里执行时，产生了 Error 或 Exception 导致程序异常崩溃。 -> (Yes / No)
Yes

情况 D：线程在同步代码块里调用了 this.wait() 方法。 -> (Yes / No)
Yes
     */
}
