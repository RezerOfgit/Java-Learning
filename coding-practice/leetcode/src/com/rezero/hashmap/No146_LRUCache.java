package com.rezero.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Re-zero
 * @version 1.0
 * 请你设计并实现一个满足  LRU (最近最少使用) 缓存 约束的数据结构。
 * 实现 LRUCache 类：
 * LRUCache(int capacity) 以 正整数 作为容量 capacity 初始化 LRU 缓存
 * int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
 * void put(int key, int value) 如果关键字 key 已经存在，则变更其数据值 value ；
 * 如果不存在，则向缓存中插入该组 key-value 。如果插入操作导致关键字数量超过 capacity ，
 * 则应该 逐出 最久未使用的关键字。
 * 函数 get 和 put 必须以 O(1) 的平均时间复杂度运行。
 */
public class No146_LRUCache {
}

class LRUCache {
    // 1. 定义双向链表节点
    class Node {
        int key, value;
        Node prev, next;

        Node(int k, int v) {
            this.key = k;
            this.value = v;
        }
    }

    private Map<Integer, Node> map = new HashMap<>();
    private Node head, tail;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        // 伪头部和伪尾部，简化边界判断
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node node = map.get(key);
        // 【逻辑点 1：既然访问了，就要把它移动到头】
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            moveToHead(node);
        } else {
            if (map.size() == capacity) {
                // 【逻辑点 2：内存满了，删除末尾节点】
                Node last = removeTail();
                map.remove(last.key);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToHead(newNode);
        }
    }

    public void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void addToHead(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    public void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    public Node removeTail() {
        Node res = tail.prev;
        removeNode(res);
        return res;
    }
}
