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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource("classpath:application-test.properties")
public class BoardApiGetTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private BoardSaveService saveService;

    private void getParam() {

            BoardForm item = new BoardForm();
            item.setId(1l);
            item.setSubject("제목");
            item.setContent("내용");
            saveService.save(item);
    }

    @Test
    @DisplayName("게시판 조회 성공시 응답코드 201")
    void successGetTest() throws Exception {
        getParam();
        mockMvc.perform(get("/api/board/get/1")
                        .contentType("application/json"))
                .andDo(print())
                .andExpect(status().isCreated())
                .andReturn()
                .getResponse();
    }

    @Test
    @DisplayName("게시판 조회 실패시 에러메세지")
    void failedGetTest() throws Exception {
        String body = mockMvc.perform(get("/api/board/get/1")
                .contentType("application/json"))
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));
        assertTrue(body.contains("게시글 조회 실패"));
    }
}
