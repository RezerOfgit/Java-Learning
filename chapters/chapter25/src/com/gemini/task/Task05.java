package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task05 {
    /*
    我们打开了 Connection, Statement, ResultSet，用完之后必须关闭。
    请问它们关闭的标准顺序是什么？为什么要按这个顺序关闭？

    ResultSet → Statement → Connection
    即 与创建顺序相反（后创建的先关闭）。
    先打开的后关，后打开的先关 —— 这就是经典的 LIFO（后进先出） 原则，
    和栈（Stack）的逻辑一样。先关依赖者（子资源），再关被依赖者（父资源），避免资源泄漏和异常。
     */
}
