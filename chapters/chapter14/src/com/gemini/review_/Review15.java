package com.gemini.review_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review15 {
    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap();
        map.put("A", 100);       // 第1步
        Integer v1 = map.put("A", 200); // 第2步
        Integer v2 = map.put("B", 300); // 第3步
        System.out.println(v1 + " " + v2);
    }
}
