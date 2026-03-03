package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review03 {
    /*
    在今天你写的 Task03Client 中，你在发送完数据后，
    极其专业地写了一句 socket.shutdownOutput();。
问题：
如果把这句代码删掉，而服务端的读取逻辑依然是 while ((readLen = inputStream.read(buf)) != -1)，
服务端的控制台和程序状态会发生什么诡异的现象？为什么？

    客户端发送完数据后，代码继续执行，可能很快就执行到了 socket.close() 或者方法结束。
    服务端会成功接收到客户端发送的所有数据，并打印出来。
但是，当所有数据读完后，服务端并不会退出 while 循环。
服务端会阻塞（Block）在 inputStream.read(buf) 这一行代码上，永远不返回，也不会打印任何新日志。
服务端程序看起来像是“僵死”了，但实际上它在等待数据。
如果你在服务端按 Ctrl+C 强制停止，可能会看到堆栈信息停在 SocketInputStream.socketRead0。
     */
}
