package configs;

<<<<<<< HEAD
import models.member.Member;
import org.springframework.web.servlet.HandlerInterceptor;
=======
import models.member.*;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
>>>>>>> 61fd14af1414e60d0cd581d87688cf376330dbbb

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MemberOnlyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        Member member = (Member)session.getAttribute("member");
<<<<<<< HEAD
=======

        /** 로그인 했을 때 */
>>>>>>> 61fd14af1414e60d0cd581d87688cf376330dbbb
        if (member != null) { // 회원일때 컨트롤러 실행 -> 출력
            return true;
        }

<<<<<<< HEAD
=======
        /** 로그아웃 했을 때 */

>>>>>>> 61fd14af1414e60d0cd581d87688cf376330dbbb
        // 비회원 -> 로그인 페이지로 이동 -> 로그인 유도
        String url = request.getContextPath() + "/member/login";
        response.sendRedirect(url);

        return false;
    }
}