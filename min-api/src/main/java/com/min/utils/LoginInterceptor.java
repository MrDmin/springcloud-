package com.min.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.Map;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("[MIN]:preHandle");
        //获取请求的数据
//        Map<String, String[]> map =  request.getParameterMap();
//        Enumeration<String> enumeration =  request.getParameterNames();
//        while (enumeration.hasMoreElements()){
//            System.out.println("[MIN]:enumeration:" + enumeration.nextElement());
//        }
//        System.out.println("[MIN]:" + map.get("token")[0] );
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("[MIN]:postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("[MIN]:afterCompletion");
    }
}
