package tests;

import models.member.*;
import models.member.LoginService;
import models.member.LoginValidationException;
import models.member.LoginValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class MemberLoginTest {

    private LoginService loginService;

    private JoinService joinService;
    private MemberDao memberDao;
    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpSession session;

    private Member member;

    @BeforeEach
    void init() {
        memberDao = new MemberDao();
        loginService = new LoginService(new LoginValidator(memberDao), memberDao);
        JoinValidator joinValidator = new JoinValidator();
        joinValidator.setMemberDao(memberDao);
        joinService = new JoinService(joinValidator, memberDao);

        member = memberDao.get("user01");
        if (member ==  null) {
            member = new Member();
            member.setUserId("user01");
            member.setUserPw("12345678");
            member.setUserPwRe("12345678");
            member.setUserNm("사용자01");
            joinService.join(member);
        }
    }

    private void createSuccessData() {
        given(request.getParameter("userId")).willReturn(member.getUserId());
        given(request.getParameter("userPw")).willReturn(member.getUserPw());
        given(request.getSession()).willReturn(session);
    }

    private void createWrongData(String userId, String userPw) {
        given(request.getParameter("userId")).willReturn(userId);
        given(request.getParameter("userPw")).willReturn(userPw);
    }

    @Test
    @DisplayName("로그인에 성공하면 예외 없음")
    void loginSuccessTest() {
        assertDoesNotThrow(() -> {
            createSuccessData();
            loginService.login(request);
        });
    }

    @Test
    @DisplayName("로그인 필수항목(userId, userPw) 체크 - 검증 실패시 LoginValidationException 발생")
    void loginRequiredFieldsTest() {
        assertAll(
                () -> assertThrows(LoginValidationException.class, () -> {
                    createWrongData(null, member.getUserPw());
                    loginService.login(request);
                }),
                () -> assertThrows(LoginValidationException.class, () -> {
                    createWrongData(" ", member.getUserPw());
                    loginService.login(request);
                }),
                () -> assertThrows(LoginValidationException.class, () -> {
                    createWrongData(member.getUserId(), null);
                    loginService.login(request);
                }),
                () -> assertThrows(LoginValidationException.class, () -> {
                    createWrongData(member.getUserId(), " ");
                    loginService.login(request);
                })
        );
    }

    @Test
    @DisplayName("등록되지 않은 아이디로 로그인시 LoginValidationException 발생, 가입되지 않은 회원입니다 메세지 체크")
    void loginMemberExistsTest() {
        assertAll(
                () -> assertDoesNotThrow(() -> {
                    createSuccessData();
                    loginService.login(request);
                }),
                () -> {
                    LoginValidationException thrown = assertThrows(LoginValidationException.class, () -> {
                        createWrongData("user02", member.getUserPw());
                        loginService.login(request);
                    });

                    String message = thrown.getMessage();
                    assertTrue(message.contains("가입되지 않은 회원"));
                }
        );
    }

    @Test
    @DisplayName("가입한 회원의 비밀번호가 일치하지 않는 경우 - loginValidationException 아이디 또는 비밀번호가 일치하지 않습니다 메세지 체크")
    void loginPasswordCheck() {
        LoginValidationException thrown = assertThrows(LoginValidationException.class, () -> {
            createWrongData(member.getUserId(), "1234");
            loginService.login(request);
        });
        String message = thrown.getMessage();
        assertTrue(message.contains("아이디 또는 비밀번호가 일치하지"));
    }

}