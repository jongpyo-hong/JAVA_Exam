package models.member;

import validators.Validator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginService {
    private MemberDao memberDao;
    private Validator<HttpServletRequest> validator;

    public LoginService(Validator<HttpServletRequest> validator, MemberDao memberDao) {
        this.validator = validator;
        this.memberDao = memberDao;
    }
    public void login(HttpServletRequest request) {
        validator.check(request);

        Member member = memberDao.get(request.getParameter("userId"));
        HttpSession session = request.getSession();
        session.setAttribute("member", member);

    }
}