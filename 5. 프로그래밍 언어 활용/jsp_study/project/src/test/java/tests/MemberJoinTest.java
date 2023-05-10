package tests;

import models.member.JoinService;
import models.member.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.*;

public class MemberJoinTest {

    private JoinService joinService;
    private Member member;

    @BeforeEach
    void init() {
        MemberDao memberDao = new MemberDao();
        JoinValidator validator = new JoinValidator();
        validator.setMemberDao(memberDao);
        joinService = new JoinService(validator, memberDao);
        member = getMember();
    }

    private Member getMember() {
        Member member = new Member();
        member.setUserNm("사용자01");
        member.setUserId("user01");
        member.setUserPw("12345678");
        member.setUserPwRe("12345678");

        return member;
    }

    @Test
    @DisplayName("회원가입에 성공하면 예외없음")
    void JoinSuccessTest() {
        assertDoesNotThrow(() -> {
            joinService.join(member);
        });
    }

    @Test
    @DisplayName("필수항목 (userId, userPw, userPwRe, userNm) 체크 - 실패시 JoinValidationException 발생")
    void joinRequiredFieldsTest() {
        assertAll(
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member =  getMember();
                    member.setUserId(null);
                    joinService.join(member);
                }),
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = new Member();
                    member.setUserId(" ");
                    joinService.join(member);
                }),
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = new Member();
                    member.setUserPw(null);
                    joinService.join(member);
                }),
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = new Member();
                    member.setUserPw(" ");
                    joinService.join(member);
                }),
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = new Member();
                    member.setUserPwRe(null);
                    joinService.join(member);
                }),
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = new Member();
                    member.setUserPwRe(" ");
                    joinService.join(member);
                }),
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = new Member();
                    member.setUserNm(null);
                    joinService.join(member);
                }),
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = new Member();
                    member.setUserNm(" ");
                    joinService.join(member);
                })
        );

    }

    @Test
    @DisplayName("비밀번호 일치여부 테스트 - 일치하지 않으면 JoinValidationException 발생 + 예외문구")
    void passwordCheckTest() {
        member.setUserPwRe("1234");

        JoinValidationException thrown = assertThrows(JoinValidationException.class, () -> {
            joinService.join(member);
        });

        String message = thrown.getMessage();
        assertTrue(message.contains("비밀번호가 일치하지 않습니다"));
    }

    @Test
    @DisplayName("userId(6~16), userPw(8~) 길이 테스트 - 실패시 JoinValidationException 발생")
    void userIdUserPwLengthTest() {
        assertAll(
                () -> assertThrows(JoinValidationException.class, () -> {
                    member = getMember();
                    member.setUserId("user1");
                    joinService.join(member);
                }),
                () -> assertThrows(JoinValidationException.class, () -> {
                    member = getMember();
                    member.setUserId("user123456789123456789");
                    joinService.join(member);
                }),
                () -> {
                    JoinValidationException thrown = assertThrows(JoinValidationException.class, () -> {
                        member = getMember();
                        member.setUserPw("123456");
                        member.setUserPwRe("123456");
                        joinService.join(member);
                    });

                    String message = thrown.getMessage();
                    assertTrue(message.contains("비밀번호는 8자리 이상"));
                }

        );

    }

    @Test
    @DisplayName("아이디 중복 체크")
    void duplicateUserIdTest() {
        // 두번 중복 가입 했을때
        assertThrows(JoinValidationException.class, () -> {
            member.setUserId("user99");
            joinService.join(member); // 최초 가입

            joinService.join(member); // 중복 가입
        });
    }





}