package com.rezero.tree;

/**
 * @author Re-zero
 * @version 1.0
 * Trie（发音类似 "try"）或者说 前缀树 是一种树形数据结构，用于高效地存储和检索
 * 字符串数据集中的键。这一数据结构有相当多的应用情景，例如自动补全和拼写检查。
 *
 * 请你实现 Trie 类：
 * Trie() 初始化前缀树对象。
 * void insert(String word) 向前缀树中插入字符串 word 。
 * boolean search(String word) 如果字符串 word 在前缀树中，
 * 返回 true（即，在检索之前已经插入）；否则，返回 false 。
 * boolean startsWith(String prefix) 如果之前已经插入的字符串 word 的前缀之一为
 * prefix ，返回 true ；否则，返回 false 。
 */
public class No208_Trie {
}
class Trie {
    // 定义节点结构
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // 插入单词
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    // 查找单词是否存在
    public boolean search(String word) {
        TrieNode node = find(word);
        return node != null && node.isEnd;
    }

    // 查找是否存在以 prefix 为前缀的单词
    public boolean startsWith(String prefix) {
        return find(prefix) != null;
    }

    // 辅助方法：沿着路径走，返回最后的节点
    private TrieNode find(String s) {
        TrieNode node = root;
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }
}