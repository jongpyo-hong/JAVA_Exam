package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;

public class Exam02Test {

    @TempDir // 임시파일 생성
    private File file;

    @Test
    @DisplayName("임시파일 생성 테스트")
    void test1() {
        String path = file.getPath();
        System.out.println(path);
    }

    @AfterEach
    void destroy() {
        file.delete();
        System.out.println("임시 파일 삭제");
    }
}
