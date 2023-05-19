package controllers;

import lombok.RequiredArgsConstructor;
import models.member.Member;
import models.member.MemberDao;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class LoginValidator implements Validator {

    private final MemberDao memberDao;

    @Override
    public boolean supports(Class<?> clazz) {
        return LoginForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        LoginForm loginForm = (LoginForm)target;

        /** 1. 아이디로 회원이 조회 되는지
            2. 회원이 있으면 비밀번호(Bcrypt - hash)가 일치하는지
         */
        String userId = loginForm.getUserId();
        String userPw = loginForm.getUserPw();

        // 1. 아이디로 회원이 조회 되는지
        if (userId == null || userId.isBlank() || userPw == null || userPw.isBlank()) {
            return;
        }

        Member member = memberDao.get(userId);
        if (member == null) {
            errors.reject("login.fail");
        }

        // 2. 회원이 있으면 비밀번호가 일치하는지
        if (member != null) {
            boolean matched = BCrypt.checkpw(userPw, member.getUserPw());
            if (!matched) {
                errors.reject("login.fail");
            }
        }
    }
}
