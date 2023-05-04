package tests;

import models.member.JoinService;
import models.member.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberJoinTest {
    private JoinService joinservice;
    private Member member;

    @BeforeEach
    void init() {
        joinservice = new JoinService(new JoinValidator());
        member = getMember();
    }

    private Member getMember() {
        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("_aA123456");
        member.setUserPwRe("_aA123456");
        member.setUserNm("사용자01");

        return member;
    }
    @Test
    @DisplayName("회원가입에 성공시 예외가 발생하지 않는다")
    void joinSuccessTest() {

        assertDoesNotThrow(() -> {
            joinservice.join(member);
        });
    }

    @Test
    @DisplayName("필수 항목(userId, userPw, userPwRe, userNm) 체크 - 검증 실패시 - JoinValidationException 발생 ")
    void joinRequiredFieldsTest() {
        assertAll(
                // userId 필수 항목 검증 - null
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserId(null);
                    joinservice.join(member);
                }),
                // userId 필수 항목 검증 - 공백
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserId(" ");
                    joinservice.join(member);
                }),
                // userPw 필수 항목 검증 - null
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserPw(null);
                    joinservice.join(member);
                }),
                // userPw 필수 항목 검증 - 공백
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserPw(" ");
                    joinservice.join(member);
                })


        );
    }

}
