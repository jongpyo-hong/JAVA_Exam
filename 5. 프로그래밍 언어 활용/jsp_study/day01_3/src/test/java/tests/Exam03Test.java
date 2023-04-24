package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class Exam03Test {

    @Test
    @DisplayName("Timeout 테스트")
    @Timeout(value=1000, unit= TimeUnit.MILLISECONDS) // 1초 이내에 수행이 완료되어야 통과 - 성능 테스트
    void test1() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
