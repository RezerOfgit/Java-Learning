package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review30 {
    /*
    考察点：刚刚总结的文章案例三。
    题目： 在增强 for 循环（for(Object o : list)）中直接调用
     list.remove(o) 会抛出 ConcurrentModificationException。
   要解决这个问题，必须使用 iterator 提供的 remove() 方法，
   因为它会同步更新 modCount 版本号。
     */
}
