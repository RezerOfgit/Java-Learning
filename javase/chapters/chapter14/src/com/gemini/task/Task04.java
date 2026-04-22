package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Collection;

public class Task04 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("红楼梦");
        col.add("水浒传");

        // 使用增强 for 循环
        for (Object book : col) {
            System.out.println(book);
        }
    }
}
