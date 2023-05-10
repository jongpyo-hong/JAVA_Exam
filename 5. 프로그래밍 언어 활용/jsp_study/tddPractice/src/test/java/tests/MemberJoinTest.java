package tests;

import models.member.*;
import models.member.JoinValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberJoinTest {
    private Member member;
    private JoinValidator joinValidator;
    private JoinService joinService;

    @BeforeEach
    void init() {
        joinValidator = new JoinValidator();
        joinService = new JoinService(joinValidator);

    }

    public Member getMember() {
        member = new Member();
        member.setUserId("user01");
        member.setUserPw("12345678");
        member.setUserPwRe("12345678");
        member.setUserNm("사용자01");
        member.setUserEmail("user01@example.com");
        member.setUserPhone("010-1234-5678");

        return member;
    }

    @Test
    @DisplayName("회원가입 테스트 - 성공시 예외없음")
    void JoinSuccessTest() {
        assertDoesNotThrow(() -> {
            member = getMember();
            joinService.join(member);
        });
    }

    @Test
    @DisplayName("필수 항목 체크(member) - 실패시 JoinValidationException 발생")
    void RequiredFieldsTest() {
        assertAll(
                // userId - null
                () -> assertThrows(JoinValidationException.class, () -> {
                    member = getMember();
                    member.setUserId(null);
                    joinService.join(member);
                }),
                // userId - 공백
                () -> assertThrows(JoinValidationException.class, () -> {
                    member = getMember();
                    member.setUserId(" ");
                    joinService.join(member);
                }),
                // userPw - null
                () -> assertThrows(JoinValidationException.class, () -> {
                    member = getMember();
                    member.setUserPw(null);
                    joinService.join(member);
                }),
                // userPw - 공백
                () -> assertThrows(JoinValidationException.class, () -> {
                    member = getMember();
                    member.setUserPw(" ");
                    joinService.join(member);
                }),
                // userPwRe - null
                () -> assertThrows(JoinValidationException.class, () -> {
                    member = getMember();
                    member.setUserPwRe(null);
                    joinService.join(member);
                }),
                // userPwRe - 공백
                () -> assertThrows(JoinValidationException.class, () -> {
                    member = getMember();
                    member.setUserPwRe(" ");
                    joinService.join(member);
                }),
                // userNm - null
                () -> assertThrows(JoinValidationException.class, () -> {
                    member = getMember();
                    member.setUserNm(null);
                    joinService.join(member);
                }),
                // userNm - 공백
                () -> assertThrows(JoinValidationException.class, () -> {
                    member = getMember();
                    member.setUserNm(" ");
                    joinService.join(member);
                }),
                // userEmail - null
                () -> assertThrows(JoinValidationException.class, () -> {
                    member = getMember();
                    member.setUserEmail(null);
                    joinService.join(member);
                }),
                // userEmail - 공백
                () -> assertThrows(JoinValidationException.class, () -> {
                    member = getMember();
                    member.setUserEmail(" ");
                    joinService.join(member);
                }),
                // userPhone - null
                () -> assertThrows(JoinValidationException.class, () -> {
                    member = getMember();
                    member.setUserPhone(null);
                    joinService.join(member);
                }),
                // userPhone - 공백
                () -> assertThrows(JoinValidationException.class, () -> {
                    member = getMember();
                    member.setUserPhone(" ");
                    joinService.join(member);
                })
        );
    }
}
