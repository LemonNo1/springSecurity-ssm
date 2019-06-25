package com.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyAuthenticationFailureHandler implements AuthenticationFailureHandler {

    private ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 用户登录失败会走到这里
     * @param httpServletRequest
     * @param httpServletResponse
     * @param authenticationException
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                        AuthenticationException authenticationException) throws IOException, ServletException {
        Map<String, Object> result = new HashMap<>();
        result.put("success", false);
        result.put("errorMsg",authenticationException.getMessage());
        String json = objectMapper.writeValueAsString(result);
        httpServletResponse.setContentType("text/json;charset=utf-8");
        httpServletResponse.getWriter().write(json);
    }

}
