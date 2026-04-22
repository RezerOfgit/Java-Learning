package com.gemini.task_;

/**
 * @author Re-zero
 * @version 1.0
 */
import java.util.ArrayList;

public class Task07 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        //list1.add(10);不可
        list1.add("B");
        //list1.add(new Object());不可

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(10);
//         list2.add("B");//不可
//         list2.add(new Object());//不可

        // 调用方法
        printList(list1); // 1. 能通过吗？ (Yes/No)yes
        printList(list2); // 2. 能通过吗？ (Yes/No)yes
    }

    // 接收任意类型的 List
    public static void printList(ArrayList<?> list) {
        // 遍历
        for (Object o : list) { // ? 最终都会转为 Object
            System.out.println(o);
        }

        // ☠️ 3. 陷阱题：
        // 我能在方法里往 list 添加数据吗？
        // list.add(10);
        // list.add("B");
        // list.add(new Object());

        // 问：上面这三行 add 操作，有哪行能通过编译吗？
        // A. 都能
        // B. 都不能 (除了 null)
        // C. 只有 Object 能
    }
}
