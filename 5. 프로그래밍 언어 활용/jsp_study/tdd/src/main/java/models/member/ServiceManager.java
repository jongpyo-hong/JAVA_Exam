package models.member;

import validators.Validator;

public class ServiceManager {
    public MemberDao memberDao() {
        return new MemberDao();
    }

    public JoinValidator joinValidator() {
        JoinValidator validator = new JoinValidator();
        validator.setMemberDao(memberDao());

        return validator;
    }

    public LoginValidator loginValidator() {
        return new LoginValidator(memberDao());
    }

    public JoinService getJoinService() {
        return new JoinService(joinValidator(), memberDao());
    }

    public LoginService getLoginService() {
        return new LoginService(loginValidator(), memberDao());
    }

}
