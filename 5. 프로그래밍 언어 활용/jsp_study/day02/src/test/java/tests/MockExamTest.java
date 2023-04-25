package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.servlet.http.HttpSession;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.mock;

public class MockExamTest {

    HttpSession session;
    @BeforeEach
    void init() {
        session = mock(HttpSession.class); // session 을 모의 객체(가짜 객체)로 만든다
        // 스텁
        given(session.getAttribute("userId")).willReturn("user01");
        given(session.getAttribute("userPw")).willReturn("12345678");
    }

    @Test
    @DisplayName("Mockito 연습1")
    void test1() {
        // 특정 상황에서만 테스트 할 수 있는 객체


        String userId = (String)session.getAttribute("userId");
        String userPw = (String)session.getAttribute("userPw");

        assertEquals("user01", userId);
        assertEquals("12345678", userPw);
    }

    @Test
    @DisplayName("LoginService:check 메서드 테스트 - 성공시 ....님 로그인")
    void test2() {
        LoginService service = new LoginService();
        String userId = (String)session.getAttribute("userId");
        String result = service.check(session);
        String expected = "(" + userId + ")님 로그인";

        assertEquals(expected, result);
    }


}
