package tests;

import models.member.JoinService;
import models.member.JoinValidationException;
import models.member.Member;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD 연습 첫시간")
public class Exam01Test {
    private Member member;
    private JoinService service;

    @BeforeAll
    static void allInit() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void init() { // 각 단위 테스트 전에 처리할 부분
        member = new Member();
        member.setUserId("user01");
        member.setUserPw("123456");

        service = new JoinService();
        System.out.println("BeforeEach");
    }

    @Test // 테스트를 하는 메서드 특정
    @DisplayName("더하기 테스트")
    void test1() { // 테스트 케이스
        int result = 2 + 3;
        assertEquals(5, result);
    }

    @Test
    @DisplayName("TDD 연습1")
    @Disabled
    void test2() {
        assertEquals(5, 4); // 미통과
        assertEquals(5, 5); // 통과
    }

    @Test
    @DisplayName("TDD 연습2")
    @Disabled
    void test3() {
        assertAll(() -> assertEquals(5,4),
                () -> assertEquals(5,5),
                () -> assertEquals(10, 5)
        );
    }

    @Test
    @DisplayName("회원가입 성공시 예외 없음")
    void test4() {
        assertDoesNotThrow(() -> { // 예외가 발생하지 않으면 테스트 성공
            service.join(member);
        });
    }

    @Test
    @DisplayName("필수 항목 체크 - UserId 누락시 JoinValidationException 발생")
    void test5() {
        JoinValidationException thrown = assertThrows(JoinValidationException.class, () -> { // 반환값 = JoinValidationException
            member.setUserId(" ");
           service.join(member);
        });

        String message = thrown.getMessage();
        assertTrue(message.contains("아이디"));
    }

    @AfterEach
    void destroy() {
        System.out.println("AfterEach");
    }

    @AfterAll // 한번만 수행, static 으로 메서드 정의
    static void afterAll() {
        System.out.println("AfterAll");
    }
}
