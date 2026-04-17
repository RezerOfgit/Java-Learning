package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review01 {
}
/*
场景：前端黑客拿到了你下发的 JWT 令牌。他发现 JWT 的第二部分（Payload）只是简单的 Base64 编码。
他自己用 Base64 解码后，把里面的 "id": 1 改成了 "id": 2（老板的 ID），
然后重新用 Base64 编码并拼凑回去，发给你的服务器。

问题：当你的 LoginCheckInterceptor 拿到这个被篡改过 ID 的令牌并调用 JwtUtils.parseJWT() 时，
服务器底层到底会发生什么？为什么黑客无法伪造成功？

当黑客修改了 JWT 的 Payload（例如将 id 从 1 改为 2）并重新拼接后，
服务器调用 JwtUtils.parseJWT(jwt) 时，底层会执行签名验证。服务端使用保存的密钥（signKey）
对 Header 和篡改后的 Payload 重新计算签名，并与 JWT 末尾的 Signature 进行比较。
由于黑客无法获得密钥，他无法生成正确的签名，因此签名验证失败，
抛出 io.jsonwebtoken.SignatureException（或 JwtException）。
最终拦截器捕获异常，返回未登录错误，黑客无法伪造成功。
 */