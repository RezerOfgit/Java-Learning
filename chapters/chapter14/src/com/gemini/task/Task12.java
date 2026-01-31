package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task12 {
    /*
    题目： 请为以下 3 个变量选择最合适的实现类（ArrayList 或 LinkedList）：
userList：这是个后台管理系统的用户列表。管理员经常需要通过 ID (第几个用户) 查看详情，
偶尔会在末尾添加新用户，几乎不在中间删除用户。
选择：ArrayList

historyQueue：这是一个浏览器的“历史记录”功能。用户每访问一个新网页，
就加到头部；如果记录超过 100 条，就把**最旧的（尾部）**删掉。

选择：LinkedList

bullets：这是一个射击游戏。屏幕上有成千上万发子弹在飞。
每帧都要遍历所有子弹更新位置，但当子弹飞出屏幕或击中敌人时，
需要从集合中随机删除（可能在任何位置删除）。

(这题有坑，仔细想：遍历快重要，还是删除快重要？ArrayList遍历极快，
LinkedList遍历慢。如果是成千上万发子弹，为了偶尔的删除而牺牲遍历速度值得吗？)

选择：ArrayList (大胆说出你的想法，这题没有标准答案，只有权衡)
     */
}
