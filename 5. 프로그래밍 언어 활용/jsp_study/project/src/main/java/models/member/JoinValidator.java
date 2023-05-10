package models.member;

import validators.Validator;

public class JoinValidator implements Validator<Member> {
    private MemberDao memberDao;

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void check(Member member) {
        String userId = member.getUserId();
        String userPw = member.getUserPw();
        String userPwRe = member.getUserPwRe();
        String userNm = member.getUserNm();

        /** 필수 항목 체크 S */
        requiredCheck(userId, new JoinValidationException("아이디를 입력하세요"));
        requiredCheck(userPw, new JoinValidationException("비밀번호를 입력하세요"));
        requiredCheck(userPwRe, new JoinValidationException("비밀번호를 확인하세요"));
        requiredCheck(userNm, new JoinValidationException("사용자 이름을 확인하세요"));
        /** 필수 항목 체크 E */

        /** 비밀번호 일치 여부 체크 */
        if (!userPw.equals(userPwRe)) {
            throw new JoinValidationException("비밀번호가 일치하지 않습니다");
        }

        /** 아이디 자리수 체크 6 ~ 16 */
        lengthCheck(userId, 6, 16, new JoinValidationException("아이디는 6 ~ 16 자리로 입력해야 합니다"));

        /** 비밀번호 자리수 체크 8~ */
        lengthCheck(userPw, 8, new JoinValidationException("비밀번호는 8자리 이상 입력해야 합니다"));

        /** 중복 가입 체크 */
        if (memberDao.get(userId) != null) {
            throw new JoinValidationException("이미 가입된 회원입니다");
        }
    }

}