package com.gemini.supplement_;

import java.util.Hashtable;

/**
 * @author Re-zero
 * @version 1.0
 * 操作步骤
 * new Hashtable().put("key", null);
 * Debug 运行，程序会崩溃。
 * 观察：控制台报的是什么异常？
 * A. IllegalArgumentException
 * B. NullPointerException //对
 * C. RuntimeException
 */
public class Supplement09 {
    public static void main(String[] args) {
        new Hashtable().put("key", null);
    }
}
