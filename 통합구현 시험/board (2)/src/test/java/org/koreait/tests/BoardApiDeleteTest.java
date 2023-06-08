package org.koreait.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.models.board.BoardDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
@AutoConfigureMockMvc
public class BoardApiDeleteTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private BoardDeleteService deleteService;

    @Test
    @DisplayName("게시글 삭제 성공시 상태코드 201")
    void deleteSuccessTest() {

    }
}
