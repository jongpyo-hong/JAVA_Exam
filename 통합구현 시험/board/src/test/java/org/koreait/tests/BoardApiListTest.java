package org.koreait.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.controllers.BoardForm;
import org.koreait.models.board.BoardSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource("classpath:application-test.properties")
public class BoardApiListTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private BoardSaveService saveService;

    private void getParams() {
        for (long i = 1; i <= 5; i++ ) {
            BoardForm items = new BoardForm();
            items.setId(i);
            items.setSubject("제목" + i);
            items.setContent("내용" + i);
            saveService.save(items);
        }
    }

    @Test
    @DisplayName("게시글 목록 조회 성공시 응답코드 201, 목록 출력")
    void successListTest() throws Exception {
        getParams();
        String body = mockMvc.perform(get("/api/board/list")
                .contentType("application/json"))
                .andDo(print())
                .andExpect(status().isCreated())
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));
        System.out.println(body);
    }

    @Test
    @DisplayName("게시글 목록 조회 실패시 에러 메세지")
    void failedListTest() throws Exception {
        String body = mockMvc.perform(get("/api/board/list")
                        .contentType("application/json"))
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));
        assertTrue(body.contains("게시글 목록 조회 실패"));
    }
}
