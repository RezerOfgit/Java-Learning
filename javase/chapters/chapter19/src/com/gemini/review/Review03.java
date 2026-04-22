package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review03 {
    /*
    你的同事小明今天学了文件拷贝，他自告奋勇写了一段代码，想把一张大小为 1026 字节 的图片 A.jpg 拷贝成 B.jpg。
小明的核心代码是这么写的（每次抽水 1024 字节）：
byte[] buf = new byte[1024];
int readLen = 0;
while ((readLen = fileInputStream.read(buf)) != -1) {
    // ⚠️ 注意小明的写入逻辑：
    fileOutputStream.write(buf);
}
请问：小明拷贝出来的 B.jpg，最终的文件大小是多少字节？它还能正常打开吗？为什么？

最终文件大小为2048字节大小,不能正常打开,
原因:小明使用了 write(buf) 而不是 write(buf, 0, readLen)，
导致最后一次读取时，把缓冲区里残留的旧数据也写入了文件。
     */
}
