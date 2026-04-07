package com.rezero.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。
 * 不考虑答案输出的顺序。
 * 异位词指由相同字母重排列形成的字符串（包括相同的字符串）。
 */
public class No438_FindAnagrams {
    //1. 找出s中和p长度相同的字符串,记录下标, 组成数组, 然后和p进行比较, 返回相同的下标组成数组
    public List<Integer> findAnagrams_my(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int sLen = s.length(), pLen = p.length();
        if (sLen < pLen) return res;

        // 将 p 转换为字符数组并排序，作为比较基准
        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);
        String pSorted = new String(pArr);

        // 遍历 s 中所有长度为 pLen 的子串
        for (int i = 0; i <= sLen - pLen; i++) {
            String sub = s.substring(i, i + pLen);
            char[] subArr = sub.toCharArray();
            Arrays.sort(subArr);
            if (Arrays.equals(subArr, pArr)) { // 或者 new String(subArr).equals(pSorted)
                res.add(i);
            }
        }
        return res;
    }


    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int sLen = s.length(), pLen = p.length();
        if (sLen < pLen) return res;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // 1. 初始化第一个窗口
        for (int i = 0; i < pLen; i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        // 2. 检查第一个窗口是否匹配
        if (Arrays.equals(pCount, sCount)) res.add(0);

        // 3. 开始向右滑动窗口
        for (int i = pLen; i < sLen; i++) {
            sCount[s.charAt(i) - 'a']++;

            sCount[s.charAt(i - pLen) - 'a']--;


            // 比较更新后的窗口是否匹配
            if (Arrays.equals(pCount, sCount)) {
                res.add(i - pLen + 1); // 记录当前窗口的左边界
            }
        }
        return res;
    }
}