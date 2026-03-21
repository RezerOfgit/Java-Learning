package com.rezero.hashmap;

import java.util.*;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个字符串数组 strs ，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * （什么是“字母异位词”？就是几个单词用的字母一模一样，只是顺序打乱了。比如 "eat"，"tea"，"ate" 是一伙的；
 * "tan"，"nat" 是一伙的；"bat" 自己是一伙的。）
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
 */
public class No49_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        // 1. 准备一个大管家：HashMap
        // Key 是排序后的标准通行证（如 "aet"），Value 是属于这个通行证的兄弟姐妹列表
        Map<String, List<String>> map = new HashMap<>();

        // 2. 遍历每一个单词
        for (String s : strs) {
            // 3. 把当前单词打散成字符数组，并进行排序
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            // 4. 把排序后的字符数组重新拼成字符串，这就是它的“Key”
            String key = new String(chars);

            // 5. 核心逻辑：安排包厢
            // 如果 map 里还没有这个 key，说明是第一次遇到这个家族，赶紧给他们建一个空的 ArrayList 放进 map 里
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // 6. 包厢肯定有了，把原本的单词 s，加入到它对应的那个家族 List 里
            // 提示：先用 map.get(key) 拿到那个 List，再调用 add(s)
            map.get(key).add(s);
        }

        // 7. 把 map 里所有的 values（也就是所有家族的 List）收集起来，统一返回
        return new ArrayList<>(map.values());
    }
}