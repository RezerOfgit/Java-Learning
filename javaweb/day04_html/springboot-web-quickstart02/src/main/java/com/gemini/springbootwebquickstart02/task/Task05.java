package com.gemini.springbootwebquickstart02.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task05 {
    /*
    结合视频内容和你刚才写的 Spring Boot 代码，请用大白话解释一下：
    **Tomcat 在整个 Web 访问流程中，到底扮演了一个什么角色？
    **（提示：你可以把它比作饭店里的服务员、大堂经理或者厨房等）。

把 Tomcat 比作 饭店里的“服务员” 就特别好懂：
顾客（浏览器） 喊：“我要一份宫保鸡丁（相当于发送 HTTP 请求）”。
服务员（Tomcat）：
先接待：听清楚顾客要什么，记下来。
然后传菜到厨房：把菜单交给后厨（你的 Java Web 程序，比如 Servlet 或 Controller）。
等厨房做好菜：你的程序返回结果（比如 HTML 或 JSON 数据）。
最后端菜给顾客：把响应结果打包成 HTTP 响应，送回给浏览器。

关键作用：
Tomcat 是一个 Web 容器，也是 Servlet 容器。它负责：
监听网络端口（比如 8080），接收浏览器的请求。
解析 HTTP 协议，把请求数据封装成 Java 能识别的 HttpServletRequest 对象。
调用你写的代码（Servlet / Spring MVC 控制器）来处理业务。
再把代码返回的结果封装成 HttpServletResponse，按 HTTP 协议发送回浏览器。

没有 Tomcat 会怎样？
你写的 Java 代码自己不会和网络打交道，也听不懂 HTTP 语言。Tomcat 就像翻译 + 接线员，
让你的程序能和浏览器顺畅对话。所以它叫做 “中间件”——夹在浏览器和你写的代码之间干活。


     */
}
