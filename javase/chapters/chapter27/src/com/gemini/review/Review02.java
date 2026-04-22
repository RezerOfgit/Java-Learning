package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review02 {
    /*
调用 phone.matches("\\d{11}") 会返回false
原因:String.matches() 底层调用的是 matcher.matches()，要求整个字符串完全匹配，
不是 matcher.find()。
matches()  →  要求【整个字符串】完全匹配
find()     →  只要字符串中【任意位置】能找到匹配的子串就行

     */
    public static void main(String[] args) {
        String phone = "A13800138000B";
        boolean isValid = phone.matches("\\d{11}");
        System.out.println(isValid);
    }
}
