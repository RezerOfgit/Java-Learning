package com.rezero.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Re-zero
 * @version 1.0
 */
//@WebFilter(urlPatterns = "/*")
public class AbcFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Abc 拦截到了请求...放行前逻辑");
        //放行
        chain.doFilter(request,response);

        System.out.println("Abc 拦截到了请求...放行后逻辑");
    }
}
