package com.gemini.task_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task03 {
}
/*
问题： 如果把 t1.start() 换成 t1.run()（如上图代码）：
程序会报错吗？
不会报错
"主线程(Main)继续执行..." 这句话，是会在下载开始前打印，还是在下载全部结束后打印？
在下载全部结束后打印
这说明了什么？（请用一句话概括 run() 和 start() 的区别）
start0(); 是本地方法, 是JVM调用, 底层是C/C++实现
真正实现多线程的效果 是start0(),而不是 run

 */
class ThreadTest {
    public static void main(String[] args) {
        DownloadTask t1 = new DownloadTask(); // 刚才写的那个类

        // 动作 A: 直接调用 run()
        t1.run();

        // 动作 B: 打印主线程信息
        System.out.println("主线程(Main)继续执行...");
    }
}

//    真正启动线程 (start)              普通方法调用 (run)
//        +----------------------+       +----------------------+
//        |      Main Thread     |       |      Main Thread     |
//        +----------------------+       +----------------------+
//        |                              |
//        t1.start() 调用本地方法             t1.run()
//        |                              |
//        [JVM 创建新的系统线程] <---+              |
//        |             |       (并没有新线程产生)
//        +------------------+     |                |
//        |   New Thread-0   |     |      [DownloadTask.run]
//        +------------------+     |                |
//        |      run()       |     |      (必须等run执行完)
//        |   (真正异步执行)   |     |                |
//        +------------------+     |                V
//        |      System.out.println(...)