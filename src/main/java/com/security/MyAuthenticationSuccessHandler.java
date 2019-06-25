package com.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    //ObjectMapper: jackson 框架的工具类，用于转换对象为 json 字符串
    private ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 用户登录成功会走到这里
     * @param httpServletRequest
     * @param httpServletResponse
     * @param authentication：代表认证成功后的信息
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                        Authentication authentication) throws IOException, ServletException {
        //返回 json 字符串给前端
        Map<String, Object> result = new HashMap<>();
        result.put("success", true);
        String json = objectMapper.writeValueAsString(result);
        httpServletResponse.setContentType("text/json;charset=utf-8");
        httpServletResponse.getWriter().write(json);
    }
}
