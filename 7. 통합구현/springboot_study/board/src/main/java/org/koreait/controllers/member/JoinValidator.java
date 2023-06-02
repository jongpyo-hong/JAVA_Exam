package org.koreait.controllers.member;

import lombok.RequiredArgsConstructor;
import org.koreait.commons.validators.MobileValidator;
import org.koreait.repositories.MemberRepository;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class JoinValidator implements Validator, MobileValidator {

    private final MemberRepository repository;

    @Override
    public boolean supports(Class<?> clazz) {
        return JoinForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        JoinForm joinForm = (JoinForm)target;

        /** 1. 아이디 중복여부
         *  2. 비밀번호 일치여부
         *  3. 휴대폰 번호 검증 */

        String userId = joinForm.getUserId();
        String userPw = joinForm.getUserPw();
        String userPwRe = joinForm.getUserPwRe();
        String mobile = joinForm.getMobile();

        /** 1. 아이디 중복여부 */
        if (userId != null && userId.isBlank() && repository.exists(userId)) {
            errors.rejectValue("userId", "Duplicate.joinForm.userId");
        }

        /** 2. 비밀번호 일치여부 */
        if (userPw != null && userPw.isBlank()
                && userPwRe != null && userPwRe.isBlank() && !userPw.equals(userPwRe)) {
            errors.rejectValue("userPwRe", "Incorrect.joinForm.userPwRe");
        }

        /** 3. 휴대폰 번호 검증 (필수항목 X, 있을때만 검증) */
        if (mobile != null && mobile.isBlank()) {
            if (!mobileCheck(mobile)) {
                errors.rejectValue("mobile", "Validation.mobile");
            }

            mobile = mobile.replaceAll("\\D", "");
            joinForm.setMobile(mobile);
        }


    }
}
