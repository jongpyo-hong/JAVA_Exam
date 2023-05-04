package models.member;

import validators.Validator;

public class JoinValidator implements Validator<Member> {

    @Override
    public void check(Member member) {
        String userId = member.getUserId();
        String userPw = member.getUserPw();
        requiredCheck(userId, new JoinValidationException("아이디를 입력하세요"));
        requiredCheck(userPw, new JoinValidationException("비밀번호를 입력하세요"));

    }
}
