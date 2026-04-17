package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 * 场景：目前的 GlobalExceptionHandler 会把所有错误统统拦截，并统一返回“对不起,操作失败,请联系管理员”。
 * 但在 JWT 校验中，如果令牌过期，底层会抛出 io.jsonwebtoken.ExpiredJwtException。
 * 如果前端拿到通用错误，并不知道是因为登录过期了，就不会自动跳回登录页。
 *
 * 任务：请在现有的 GlobalExceptionHandler 类中，新增一个方法。
 * 要求：当系统抛出 ExpiredJwtException 时，精确拦截该异常，
 * 并给前端返回 Result.error("登录已过期，请重新登录")。写出该新增方法的完整代码。
 */
public class Review03 {
/*
    // 新增：精确处理令牌过期异常
    @ExceptionHandler(ExpiredJwtException.class)
    public Result handleExpiredJwtException(ExpiredJwtException e) {
        // 可记录日志
        return Result.error("登录已过期，请重新登录");
    }
 */
}
