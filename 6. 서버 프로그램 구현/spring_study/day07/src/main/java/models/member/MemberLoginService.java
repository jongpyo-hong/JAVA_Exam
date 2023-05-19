package models.member;

import controllers.LoginForm;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Service
@RequiredArgsConstructor
public class MemberLoginService {
    private final MemberDao memberDao;

    private final HttpSession session;

    private final HttpServletResponse response; // 쿠키

    public void login(LoginForm loginForm) {
        String userId = loginForm.getUserId();

        Member member = memberDao.get(userId);

        session.setAttribute("member", member);

        Cookie cookie = new Cookie("saveId", userId);
        if(loginForm.isSaveId()) { // 아이디 쿠키 저장 기능
               cookie.setMaxAge(60 * 60 * 24 * 365);
        } else { // 아이디 쿠키 삭제 기능
            cookie.setMaxAge(0);
        }

        response.addCookie(cookie);
    }
}
