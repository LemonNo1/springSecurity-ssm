package com.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 在spring中，filter都默认继承OncePerRequestFilter，但为什么要这样呢？
 * OncePerRequestFilter顾名思义，他能够确保在一次请求只通过一次filter，而不需要重复执行。
 */
public class ImageCodeAuthenicationFilter extends OncePerRequestFilter {

    private AuthenticationFailureHandler authenticationFailureHandler;

    public AuthenticationFailureHandler getAuthenticationFailureHandler() {
        return authenticationFailureHandler;
    }

    public void setAuthenticationFailureHandler(AuthenticationFailureHandler authenticationFailureHandler) {
        this.authenticationFailureHandler = authenticationFailureHandler;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        //判断是否为login请求
        if (request.getRequestURI().trim().contains("/securityLogin")) {
            try {
                String imageCode = request.getParameter("imageCode");
                String key = (String) request.getSession().getAttribute("key");
                if (StringUtils.isEmpty(imageCode)) {
                    throw new ImageCodeException("验证码为空");
                }
                if (!key.trim().toUpperCase().equals(imageCode.toUpperCase().trim())) {
                    throw new ImageCodeException("验证码不正确");
                }
            } catch (AuthenticationException e) {
                //交给自定义的authentication处理
                authenticationFailureHandler.onAuthenticationFailure(request, response, e);
                return;
            }
        }
        //* 如果不是login请求，放行
        filterChain.doFilter(request, response);
    }
}
