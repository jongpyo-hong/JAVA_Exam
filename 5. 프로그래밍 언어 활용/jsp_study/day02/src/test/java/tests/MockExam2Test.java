package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.servlet.http.HttpServletRequest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;


@ExtendWith(MockitoExtension.class) // @Mock 기능 추가
public class MockExam2Test {
    @Mock // 가짜객체를 생성하지 않아도 자동으로 만들어 준다
    private HttpServletRequest request;
    private LoginService service;

    @BeforeEach
    void init() {
        //request = mock(HttpServletRequest.class); // 가짜객체 mock(웹서버가 없는 상황에서 기능테스트를 위해 생성)
        given(request.getParameter("userId")).willReturn("user01"); // 스텁 (가짜 데이터)
        given(request.getParameter("userPw")).willReturn("12345678");

        service = new LoginService();
    }

    private void changeParameter(String key, String value) {
        given(request.getParameter(key)).willReturn(value);
    }

    @Test
    @DisplayName("로그인 성공시 예외 없음")
    void loginSuccessTest() {

        assertDoesNotThrow(() -> {
            service.login(request);
        });

    }

    @Test
    @DisplayName("필수 항목 검증(userId, userPw) - 검증 실패시 LoginValidationException")
    void loginTest() {

        assertThrows(LoginValidationException.class, () -> {
            // userId가 null
            changeParameter("userId", null);
            service.login(request);
        });

        assertThrows(LoginValidationException.class, () -> {
            // userId가 빈 공백
            changeParameter("userId", " ");
            service.login(request);
        });

        assertThrows(LoginValidationException.class, () -> {
            // userPw가 null
            changeParameter("userId", "user01");
           changeParameter("userPw", null);
           service.login(request);
        });

        assertThrows(LoginValidationException.class, () -> {
            // userPw가 빈값일 때
            changeParameter("userId", "user01");
            changeParameter("userPw", " ");
            service.login(request);
        });
    }
}
