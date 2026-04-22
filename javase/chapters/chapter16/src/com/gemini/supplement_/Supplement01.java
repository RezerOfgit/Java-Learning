package com.gemini.supplement_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Supplement01 {
    /*
    为了让你在下一章（多线程）学得更顺滑，给你补充一个 面试必考点：

ArrayList：
效率高，跑得快。
线程不安全（如果多个人同时抢着往里放东西，数据会乱）。
适用：单线程程序（比如之前的管理系统）。

Vector：
效率稍微低一点（因为要做安全检查）。
线程安全（Thread-Safe，自带锁）。
适用：坦克大战！因为后面会有“主线程”画图，“子弹线程”计算，“敌人线程”乱跑，
它们都会同时操作这个集合。这就是韩老师这里选 Vector 的深意。
     */
}
