package com.gemini.springbootwebquickstart02.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task03 {
    /*
1. GET 请求的参数（比如你要查询的姓名 `name=张三`），在 HTTP 请求报文里是放在哪里的？
GET 请求的参数是放在 请求行中的 URL 查询字符串（Query String）里，也就是 ? 后面的部分，
例如：
GET /search?name=张三 HTTP/1.1
参数会显示在地址栏、浏览器历史记录、服务器日志等地方。

2. POST 请求的参数（比如你要提交的一整篇包含几千字的文章内容），在 HTTP 请求报文里是放在哪里的？
POST 请求的参数是放在 请求体（Message Body） 中，不会出现在 URL 上。
请求体中可以是表单数据（application/x-www-form-urlencoded）、JSON、XML
或纯文本等格式，因此适合传输大量数据（如几千字的文章）。

3. 为什么面试官常说“GET 请求不适合用来传敏感数据（比如密码）”？

参数暴露：URL 中的参数会被浏览器历史记录、书签、服务器访问日志、代理服务器、Referer 头等途径记录下来，容易泄露。
缓存风险：浏览器或 CDN 可能会缓存 GET 请求的 URL 及参数，导致敏感信息被他人查看。
长度限制：URL 长度通常受浏览器和服务器限制（一般不超过 2KB-8KB），不适合长数据。
安全性：敏感信息（如密码）若放在 URL 中，更容易被中间人攻击或通过查看浏览器历史直接获取。
因此，登录、支付等操作必须使用 POST 方法，并将敏感数据放在请求体中，同时配合 HTTPS 加密传输。

     */
}
