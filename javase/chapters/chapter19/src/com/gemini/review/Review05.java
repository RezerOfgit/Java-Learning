package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review05 {
    /*
    你的同事小王今天学了 FileWriter，他想往 test.txt 里写一句“下班啦”。他写了如下代码：
FileWriter fw = new FileWriter("D:\\test.txt");
fw.write("下班啦");
// 伪代码：小王写完这句就直接拔U盘下班了，没有写 finally 和 close()

问题：

第二天小王打开 test.txt，里面会有“下班啦”这三个字吗？
没有
请用底层原理解释为什么会出现这种情况？（提示：和内存里的某个机制有关）
write()方法只是把数据写入内存缓冲区，而不是直接写入磁盘。
只有在缓冲区满、或调用flush()/close()时，数据才会被真正持久化到磁盘上。
为了确保数据一定被写入，必须在写完后调用close()方法。而为了保证即使在写入过程中发生异常，
close()也能被执行，必须把它放在finally块中，或者使用Java 7+的try-with-resources语法。
     */
}
