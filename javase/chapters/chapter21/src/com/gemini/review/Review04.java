package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review04 {
    /*
    面试官让你手写一段 TCP 客户端发送文本文件的核心代码。
    你接好了 BufferedOutputStream bos 准备往网络里写数据。
问题：
为了防止出现昨天那种“图片少了 6KB”的致命 Bug，并且让服务端知道你传完了，
请按严格的先后顺序，排列以下三句代码，并简单用大白话解释为什么必须是这个顺序。

A. socket.shutdownOutput();
B. bos.close(); (假设不使用 try-with-resources 的手动关闭)
C. bos.flush();

C A B

BufferedWriter就像一个蓄水池，你 write()的数据是存在 JVM 内存里的。
如果你先调用了 socket.shutdownOutput()，相当于把通向网线的阀门直接锁死了。
此时你再试图 flush() 把水池里的水挤进去，程序当场就会抛出
SocketException: Socket output is shutdown！数据直接丢失。
bos.close()最后关闭输出流
     */
}
