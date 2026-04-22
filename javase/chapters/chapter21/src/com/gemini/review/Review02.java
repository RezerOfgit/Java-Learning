package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review02 {
    /*
    在测试 TCP 聊天程序时，你不小心手滑，先点击运行了 Task03Client，
    再点击了 Task02Server。
问题：
客户端控制台会直接抛出一个什么异常？（用大白话描述报错含义即可）
ConnectException, 连接异常, 连接被拒绝
请结合 TCP 的“三次握手”底层逻辑，解释为什么绝对不能让 Client 先运行？
底层逻辑：打通电话必须先有“基站”。
你想想平时打电话：你（客户端）确实是“先拨号（发信息）”的那一方。
但是，如果对方（服务端）连手机都没买、没开机、或者没有在等待接听状态，
你拨号能成功吗？肯定直接提示“您拨打的用户不存在”！
     */
}
