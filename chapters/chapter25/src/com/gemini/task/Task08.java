package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task08 {
    /*
    这是一道必考面试题。请用自己的话（一两句即可）解释：
    为什么老式的 Statement 会被 SQL 注入，而用了 PreparedStatement 就安全了？
    底层的本质区别是什么？(提示：你可以用如下流程图的思路来理解)

本质区别
Statement 是把用户输入和 SQL 语句混在一起拼接，MySQL 无法区分哪部分是命令、哪部分是数据，
恶意输入会被当成 SQL 命令执行。

PreparedStatement 是先把 SQL 骨架（含 ?）提前编译好，用户输入后来只是作为纯文本数据填入 ? 的位置，
数据永远不可能变成命令。
     */
}
