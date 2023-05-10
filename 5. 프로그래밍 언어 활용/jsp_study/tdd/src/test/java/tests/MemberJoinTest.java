package tests;

import models.member.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberJoinTest {

    private JoinService joinService;
    private Member member;

    @BeforeEach
    void init() {
        MemberDao memberDao = new MemberDao();
        JoinValidator validator = new JoinValidator();
        validator.setMemberDao(memberDao);

        joinService = new JoinService(validator,memberDao);
        member = getMember();
    }

    private Member getMember() {
        Member member = new Member();
        member.setUserNm("사용자01");
        member.setUserId("user01");
        member.setUserPwRe("12345678");
        member.setUserPw("12345678");

        return member;
    }

    @Test
    @DisplayName("회원가입에 성공하면 예외가 발생하지 않음")
    void joinSuccessTest() {
        assertDoesNotThrow(() -> {
            joinService.join(member);
        });
    }

    @Test
    @DisplayName("필수 항목(userId, userPw, userPwRe, userNm) 체크 - 검증 실패시 JoinValidationException 발생")
    void joinRequiredFieldsTest() {
        assertAll(
                // userId 필수 항목 검증 - null
                () -> assertThrows(JoinValidationException.class, () -> {
                        Member member = getMember();
                        member.setUserId(null);
                        joinService.join(member);
                    }),
                // userId 필수 항목 검증 - 빈값(공백)
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserId("    ");
                    joinService.join(member);
                }),
                // userPw 필수 항목 검증 - null
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserPw(null);
                    joinService.join(member);
                }),
                // userPw 필수 항목 검증 - 빈값(공백)
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserPw("    ");
                    joinService.join(member);
                }),
                // userPwRe 필수 항목 검증 - null
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserPwRe(null);
                    joinService.join(member);
                }),
                // userPwRe 필수 항목 검증 - 빈값(공백)
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserPwRe("    ");
                    joinService.join(member);
                }),
                // userNm 필수 항목 검증 - null
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserNm(null);
                    joinService.join(member);
                }),
                // userNm 필수 항목 검증 - 빈값(공백)
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserNm("    ");
                    joinService.join(member);
                })
        );
    }

    @Test
    @DisplayName("userPw와 userPwRe가 일치하지 않으면 JoinValidationException 발생, 비밀번호가 일치하지 않습니다 예외 문구")
    void passwordConfirmMatchTest() {
        JoinValidationException thrown = assertThrows(JoinValidationException.class, () -> {
            member.setUserPwRe("1234");
            joinService.join(member);
        });

        String message = thrown.getMessage();
        assertTrue(message.contains("비밀번호가 일치하지"));
    }

    @Test
    @DisplayName("userId는 6~16, userPw은 8자리 이상, 실패시 JoinValidationException 발생")
    void userIdUserPwLengthTest() {
        assertAll(
                // 아이디 - 6자리 미만
                () -> assertThrows(JoinValidationException.class, () -> {
                    member = getMember();
                    member.setUserId("user");
                    joinService.join(member);
                }),
                // 아이디 - 8자리 초과
                () -> assertThrows(JoinValidationException.class, () -> {
                    member = getMember();
                    member.setUserId("user11111111111111111111111111111111111111111");
                    joinService.join(member);
                }),
                // 비밀번호 - 8자리 미만
                () -> {
                    JoinValidationException thrown = assertThrows(JoinValidationException.class, () -> {
                        member = getMember();
                        member.setUserPw("1234");
                        member.setUserPwRe("1234");
                        joinService.join(member);
                    });

                    String message = thrown.getMessage();
                    assertTrue(message.contains("비밀번호는 8자리 이상"));
                }
        );

    }

    @Test
    @DisplayName("userId 이미 가입된 상태라면 DuplicationUserException 발생")
    void duplicateUserIdTest() {
        // 두번 중복 가입
        assertThrows(DuplicationUserException.class, () -> {
            member.setUserId("user99");
            joinService.join(member); // 최초 가입

            joinService.join(member); // 중복 가입
        });

    }
}