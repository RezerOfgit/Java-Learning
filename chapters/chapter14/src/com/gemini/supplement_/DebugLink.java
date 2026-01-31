package com.gemini.supplement_;

/**
 * @author Re-zero
 * @version 1.0
 */
import java.util.LinkedList;
public class DebugLink {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("宋江"); // 第1个
        list.add("卢俊义"); // 第2个
        list.add("吴用");   // 第3个
        // 🔴 在这里打断点
        System.out.println("断点位置");
    }
}