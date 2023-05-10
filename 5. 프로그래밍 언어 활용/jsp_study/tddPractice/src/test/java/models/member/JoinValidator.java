package models.member;

import validators.Validator;

public class JoinValidator implements Validator<Member> {
    private Member member;
    @Override
    public void check(Member member) {
        String userId = member.getUserId();
        String userPw = member.getUserPw();
        String userPwRe = member.getUserPwRe();
        String userNm = member.getUserNm();
        String userEmail = member.getUserEmail();
        String userPhone = member.getUserEmail();

        requiredCheck(userId, new JoinValidationException("아이디를 입력하세요"));
        requiredCheck(userPw, new JoinValidationException("비밀번호를 입력하세요"));
        requiredCheck(userPwRe, new JoinValidationException("비밀번호를 확인하세요"));
        requiredCheck(userNm, new JoinValidationException("사용자 이름을 확인하세요"));
        requiredCheck(userEmail, new JoinValidationException("이메일을 확인하세요"));
        requiredCheck(userPhone, new JoinValidationException("휴대폰 번호를 확인하세요"));
    }
}
