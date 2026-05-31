/**
 * LeetCode 208. 实现 Trie (前缀树)
 * Trie（发音类似 "try"）或者说 前缀树 是一种树形数据结构，
 * 用于高效地存储和检索字符串数据集中的键。这一数据结构有相当多的应用情景，例如自动补完和拼写检查。
 * 请你实现 Trie 类：
 * - Trie() 初始化前缀树对象。
 * - void insert(String word) 向前缀树中插入字符串 word。
 * - boolean search(String word) 如果字符串 word 在前缀树中，返回 true；否则返回 false。
 * - boolean startsWith(String prefix) 如果之前已经插入的字符串 word 的前缀之一为 prefix，返回 true；否则返回 false。
 */
public class No208_Trie {

    // 内部节点类
    private class TrieNode {
        TrieNode[] children = new TrieNode[26]; // 假设只包含小写字母
        boolean isEnd = false; // 标记是否为单词结尾
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.isEnd = true; // 标记单词结束
    }

    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    // 辅助方法：沿着前缀走到底，返回最后一个节点，若路径中断则返回null
    private TrieNode searchPrefix(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                return null;
            }
            node = node.children[idx];
        }
        return node;
    }
}