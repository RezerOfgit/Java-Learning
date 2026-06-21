import java.util.LinkedList;
import java.util.Objects;

/**
 * 模拟 HashMap 的 put 流程（仅核心逻辑，非完整实现）
 * 重点关注：哈希计算、索引定位、链表插入、扩容触发
 */
public class HashMapPutDemo {

    // 模拟内部节点
    static class Node {
        final int hash;
        final String key;
        String value;
        Node next;

        Node(int hash, String key, String value, Node next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private Node[] table;          // 数组
    private int size;              // 元素个数
    private int threshold;         // 扩容阈值
    private static final float LOAD_FACTOR = 0.75f;
    private static final int INITIAL_CAPACITY = 4;  // 为了演示扩容，初始容量设小

    public HashMapPutDemo() {
        table = new Node[INITIAL_CAPACITY];
        threshold = (int) (INITIAL_CAPACITY * LOAD_FACTOR);
    }

    // 模拟 put 流程
    public void put(String key, String value) {
        int hash = hash(key);
        int index = (table.length - 1) & hash;  // 等价于取模

        // 1. 如果该位置为空，直接插入
        if (table[index] == null) {
            table[index] = new Node(hash, key, value, null);
            size++;
            checkResize();
            return;
        }

        // 2. 遍历链表，查找相同 key
        Node cur = table[index];
        Node prev = null;
        while (cur != null) {
            if (cur.hash == hash && Objects.equals(cur.key, key)) {
                // key 已存在，覆盖旧值（面试常问：为什么用 equals 比较）
                cur.value = value;
                return;
            }
            prev = cur;
            cur = cur.next;
        }

        // 3. 未找到相同 key，采用头插法（JDK7）或尾插法（JDK8+）。这里用尾插避免死循环（面试考点）
        prev.next = new Node(hash, key, value, null);
        size++;
        checkResize();
    }

    // 哈希扰动函数（简化）
    private int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    // 检查是否需要扩容（触发条件：size >= threshold）
    private void checkResize() {
        if (size < threshold) return;

        // 扩容：容量翻倍，重新计算所有元素位置（这里只打印，不完整实现）
        int newCap = table.length << 1;
        System.out.println("=== 触发扩容：容量从 " + table.length + " 变为 " + newCap + " ===");
        // 实际 HashMap 会 rehash，此处仅演示逻辑
        // 面试中可继续追问 rehash 过程
    }

    // 打印当前数组状态（便于观察）
    public void printTable() {
        for (int i = 0; i < table.length; i++) {
            System.out.print("桶[" + i + "]: ");
            Node cur = table[i];
            while (cur != null) {
                System.out.print(cur.key + "=" + cur.value + " -> ");
                cur = cur.next;
            }
            System.out.println("null");
        }
        System.out.println("size=" + size + ", threshold=" + threshold);
    }

    public static void main(String[] args) {
        HashMapPutDemo map = new HashMapPutDemo();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "4");  // 此时 size=4 >= threshold(3)，触发扩容
        map.printTable();
    }
}