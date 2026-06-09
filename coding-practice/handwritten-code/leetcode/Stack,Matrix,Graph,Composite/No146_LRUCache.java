/**
 * LeetCode 146. LRU 缓存
 * 请你设计并实现一个满足 LRU (最近最少使用) 缓存约束的数据结构。
 * 实现 LRUCache 类：
 * - LRUCache(int capacity) 以正整数作为容量 capacity 初始化 LRU 缓存
 * - int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1
 * - void put(int key, int value) 如果关键字 key 已经存在，则变更其数据值 value；
 *   如果不存在，则向缓存中插入该组 key-value。
 *   如果插入操作导致关键字数量超过 capacity，则应该逐出最久未使用的关键字
 * 函数 get 和 put 必须以 O(1) 的平均时间复杂度运行。
 */
public class No146_LRUCache {
    // 双向链表节点类
    private class Node {
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private Map<Integer, Node> map; // key → 节点引用，O(1) 定位
    private Node head; // 虚拟头节点（最新访问的节点侧）
    private Node tail; // 虚拟尾节点（最久未使用的节点侧）

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        // 初始化虚拟头尾，简化链表操作
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        // 访问后将其移到链表头部，表示最近使用
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node != null) {
            // key 已存在，更新值并移到头部
            node.value = value;
            moveToHead(node);
        } else {
            // key 不存在，创建新节点
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToHead(newNode);

            // 如果超出容量，删除链表尾部节点（最久未使用）
            if (map.size() > capacity) {
                Node removed = removeTail();
                map.remove(removed.key);
            }
        }
    }

    // ========== 链表操作辅助方法 ==========

    // 将节点添加到链表头部（虚拟头之后）
    private void addToHead(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    // 从链表中删除节点
    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // 将已存在的节点移到头部
    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    // 删除并返回尾部节点（虚拟尾之前）
    private Node removeTail() {
        Node node = tail.prev;
        removeNode(node);
        return node;
    }
}