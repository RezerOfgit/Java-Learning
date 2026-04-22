package com.gemini.task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Re-zero
 * @version 1.0
 */

public class Task21 {

    // ❌ 当前报错：未报告的异常错误 FileNotFoundException
    // 目标：修改下面这一行，把锅甩出去
    public void readFile() throws FileNotFoundException {

        // 这是一个会抛出编译时异常的危险动作
        FileInputStream fis = new FileInputStream("d:/不可描述.txt");
    }

    public static void main(String[] args) {
        // 思考：如果 readFile 甩锅了，main 方法调用它时会发生什么？
        //默认调用throws
    }
}

