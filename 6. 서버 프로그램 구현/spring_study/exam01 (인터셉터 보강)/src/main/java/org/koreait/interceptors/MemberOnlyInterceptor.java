package org.koreait.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;


public class MemberOnlyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        request.setAttribute("commonData", "공통값");

        boolean isLogin = true;
        if (isLogin) {
            return true;
        }

        String url = request.getContextPath() + "/member/login";
        response.sendRedirect(url);

        return false;
    }
}
