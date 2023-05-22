package configs;

import models.member.Member;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MemberOnlyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        Member member = (Member)session.getAttribute("member");
        if (member != null) { // 회원일때 컨트롤러 실행 -> 출력
            return true;
        }

        // 비회원 -> 로그인 페이지로 이동 -> 로그인 유도
        String url = request.getContextPath() + "/member/login";
        response.sendRedirect(url);

        return false;
    }
}