package models.member;

import javax.servlet.http.HttpServletRequest;

public class ServiceManager {
    public MemberDao memberDao() {
        return new MemberDao();
    }

    public JoinValidator joinValidator() {
        return new JoinValidator();
    }

    public LoginValidator loginValidator() {
        return new LoginValidator(memberDao());
    }

    public JoinService joinService() {
        return new JoinService(joinValidator(), memberDao());
    }

    public LoginService loginService() {
        return new LoginService(loginValidator(), memberDao());
    }

    public Member member() {
        return new Member();
    }
}
