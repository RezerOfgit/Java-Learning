package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task02 {
    /*
    假设底层正则引擎找到了文本中的第一个数字串 "1995"（它的起始索引是 6，结束索引是 10）。
请用自己的话简述：此时底层的 groups[0] 和 groups[1] 分别记录了什么数值？
调用 matcher.group(0) 时，底层又是如何利用这两个数值把 "1995" 截取出来的？

groups[0] = 6   ← 匹配的【起始索引】
groups[1] = 10  ← 匹配的【结束索引】（不含）
group(0) 如何截取	调用 text.substring(6, 10) 得到 "1995"
     */
}
