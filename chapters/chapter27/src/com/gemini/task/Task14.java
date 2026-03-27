package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task14 {
    public static void main(String[] args) {
/**
 * 请写出一个能够严格校验以下规则的邮箱正则表达式：
 * @ 符号前面：只能包含英文字母、数字和下划线 _。
 * 必须包含 @ 符号。
 * @ 符号后面：必须是一个域名，包含英文字母和点号 .（例如 qq.com 或 sina.com.cn）。
 * 写出 String regStr = "???"; 即可。
 */
        String regStr = "[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+";
    }
}
