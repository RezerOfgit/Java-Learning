package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task07 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // 1. 此时内部数组长度是 16
        sb.append("1234567890123456");      // 2. 此时append了16个字符，刚好填满
        sb.append("7");                     // 3. 再加1个，放不下了！
    }
}
