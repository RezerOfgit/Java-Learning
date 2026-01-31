package com.gemini.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task03 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("三国演义");
        col.add("西游记");

        // 1. 获取迭代器对象 (提示：调用集合的一个方法)
        Iterator iterator = col.iterator();

        // 2. 使用 while 循环遍历
        // hasNext() 判断是否还有下一个元素
        while (iterator.hasNext()) {
            // 3. next() 下移指针，并取出当前元素
            Object obj = iterator.next();
            System.out.println(obj);
        }

        // 4. 思考题：
        // 如果在 while 循环结束后，指针已经到底了，我又调用了一次 iterator.next()
        // 此时会报什么错？
        // A. 返回 null
        // B. 抛出 NoSuchElementException
    }
}
