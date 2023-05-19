package controllers;

import models.member.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class JoinValidator implements Validator {

    private MemberDao memberDao;

    @Autowired
    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return JoinForm.class.isAssignableFrom(clazz);
        // JoinForm 이라는 커맨드 객체만 검증한다는 뜻
    }

    @Override
    public void validate(Object target, Errors errors) {
        JoinForm joinForm = (JoinForm) target;

        /** 1. 아이디의 중복 여부 -> 이미 가입된 경우 에러
            2. 비밀번호, 비밀번호 확인의 일치 여부
         */

        String userId = joinForm.getUserId();
        String userPw = joinForm.getUserPw();
        String userPwRe = joinForm.getUserPwRe();

        // 1. 아이디의 중복 여부 -> 이미 가입된 경우 X
        if ( userId != null && !userId.isBlank() && memberDao.exists(userId)) {
            errors.rejectValue("userId","Duplicate" );
        }

        // 2. 비밀번호, 비밀번호 확인의 일치 여부
        if (userPw != null && !userPw.isBlank()
                && userPwRe != null && !userPwRe.isBlank() && !userPw.equals(userPwRe)) {
            errors.rejectValue("userPwRe", "Incorrect");
        }

        /** reject 를 이용한 공통 오류 만들기 */
        //errors.reject("testErrors", "테스트 공통 오류");


        /** 필수 항목 체크 - userId, userPw, userPwRe, userNm */



        /** ValidationUtils 의 필수항목 체크
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPw", "required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPwRe", "required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userNm", "required");
        */



        /** 필수 항목 체크 - 기존방법
        String userId = joinForm.getUserId();
        String userPw = joinForm.getUserPw();
        String userPwRe = joinForm.getUserPwRe();
        String userNm = joinForm.getUserNm();
         */


        /**
        if (userId == null || userId.isBlank()) {
            errors.rejectValue("userId", "required", "아이디를 입력하세요");
        }

        if (userPw == null || userPw.isBlank()) {
            errors.rejectValue("userPw", "required", "비밀번호를 입력하세요");
        }

        if (userPwRe == null || userPwRe.isBlank()) {
            errors.rejectValue("userPwRe", "required", "비밀번호를 확인하세요");
        }

        if (userNm == null || userNm.isBlank()) {
            errors.rejectValue("userNm", "required", "회원명을 입력하세요");
        }*/

    }
}
