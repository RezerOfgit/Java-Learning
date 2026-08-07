@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        // 1. 从请求头取 Token
        String token = request.getHeader("Authorization");
        if (token == null || !token.startsWith("Bearer ")) {
            response.setStatus(401);
            response.getWriter().write("{\"code\":401,\"msg\":\"未登录\"}");
            return false; // 拦截，不放行
        }

        // 2. 校验 JWT
        String realToken = token.substring(7);
        Claims claims = JwtUtils.parseToken(realToken);
        if (claims == null) {
            response.setStatus(401);
            response.getWriter().write("{\"code\":401,\"msg\":\"Token 无效\"}");
            return false;
        }

        // 3. 把用户信息存入 request，后续 Controller 可以用
        request.setAttribute("userId", claims.get("userId"));
        return true; // 放行
    }
}