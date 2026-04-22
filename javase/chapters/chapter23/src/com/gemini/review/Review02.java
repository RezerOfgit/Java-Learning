package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review02 {
    /*
    场景：假设你写了一个类，里面有一行静态变量定义：

static int port = 8080;
问题：在类加载流程中，有两个关键阶段：“连接(Linking)的准备(Prepare)阶段” 和
“初始化(Initialization)阶段”。请问在这两个不同的阶段，port 变量
在内存中的值分别会被设为多少？为什么？
 0 和 8080。
普通 static 变量：准备阶段给 0/null，初始化阶段给代码值。
final static 常量：准备阶段直接给代码值（编译期能确定的话）。

[加载] -> [连接 (验证->准备->解析)] -> [初始化]
     */
}
