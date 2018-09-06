package com.jbit.utils;

import org.springframework.http.HttpRequest;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/9/2.
 */
public class SysInterceptor extends HandlerInterceptorAdapter{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("devUserSession") != null) {
            return true;
        }
        response.sendRedirect(request.getContextPath()+"/index.jsp");
        return false;
    }
}
