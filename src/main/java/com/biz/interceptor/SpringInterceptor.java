package com.biz.interceptor;

import com.biz.component.UserComponent;
import com.biz.domain.SaleLoginUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SpringInterceptor implements HandlerInterceptor {

    @Autowired
    private UserComponent userComponent;

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        SaleLoginUser user = userComponent.checkUser(httpServletRequest);

        if (user == null) {
            httpServletResponse.sendRedirect("/login.html");

            return false;
        }

        String name = java.net.URLEncoder.encode(user.getName(),"UTF-8");

        Cookie nameCookie = new Cookie("user_name",name );
        httpServletResponse.addCookie(nameCookie);


        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
