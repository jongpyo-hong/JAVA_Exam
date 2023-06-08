package org.koreait.tests;

import org.koreait.models.board.BoardSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
@AutoConfigureMockMvc
public class BoardApiUpdateTest {
    @Autowired
    private BoardSaveService saveService;

    private String getParams(String subject, String content) {
        String params = String.format("{\"subject\":\"%s\", \"content\":\"%s\"}", subject, content);
        return params;
    }



}
