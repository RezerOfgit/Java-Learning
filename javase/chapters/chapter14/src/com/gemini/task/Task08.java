package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
class Node {
    public Object item; // 存的数据
    public Node next;   // 指向下一个节点
    public Node prev;   // 指向前一个节点

    public Node(Object name) {
        this.item = name;
    }
}

public class Task08 {
    public static void main(String[] args) {
        Node node1 = new Node("宋江");
        Node node2 = new Node("卢俊义");

        // 目标：建立双向连接

        // 1. 宋江的下面是卢俊义
        node1.next = node2;

        // 2. 卢俊义的上面是宋江
        node2.prev = node1;
    }
}
