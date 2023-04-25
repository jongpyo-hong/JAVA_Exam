package tests;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginService {

    public void login(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        if (userId == null || userId.isBlank()) {
            throw new LoginValidationException("아이디를 입력하세요");
        }

        String userPw = request.getParameter("userPw");
        if (userPw == null || userPw.isBlank()) {
            throw new LoginValidationException("비밀번호를 입력하세요");
        }
    }
    public String check(HttpSession session) {

        String userId = (String)session.getAttribute("userId");

        return "(" + userId + ")님 로그인";
    }
}
