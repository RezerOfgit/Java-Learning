package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review06 {
    /*
    你想用高级流把 A.txt 拷贝成 B.txt。代码核心逻辑如下：

    String line;
while ((line = bufferedReader.readLine()) != null) {
    bufferedWriter.write(line);
}

问题：

这段代码运行后，B.txt 的排版会变成什么鬼样子？
所有内容挤在一行
为什么 readLine() 会导致这个后果？
readLine() 读取的内容截止到行终止符。
它认为的行结束标志是：\n (换行)、\r (回车) 或 \r\n (回车换行)。
它的返回值：返回的是去掉了行终止符的字符串。
请在上面代码的适当位置，补上一行代码解决这个问题。
    String line;
while ((line = bufferedReader.readLine()) != null) {
    bufferedWriter.write(line);
    bufferedWriter.newLine();
}
     */
}
