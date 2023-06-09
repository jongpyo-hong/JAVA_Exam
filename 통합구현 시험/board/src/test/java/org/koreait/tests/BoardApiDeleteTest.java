package org.koreait.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.controllers.BoardForm;
import org.koreait.models.board.BoardDeleteService;
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
public class BoardApiDeleteTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private BoardSaveService saveService;

    private BoardForm getParam() {
        BoardForm boardForm = new BoardForm();
        boardForm.setId(1l);
        boardForm.setSubject("제목");
        boardForm.setContent("내용");
        saveService.save(boardForm);
        return boardForm;
    }

    @Test
    @DisplayName("게시글 삭제 성공시 응답코드 201")
    void successDeleteTest() throws Exception {
        getParam();
        mockMvc.perform(get("/api/board/delete/1")
                        .contentType("application/json"))
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    @DisplayName("게시글 삭제 실패시 에러 메세지")
    void failedDeleteTest() throws Exception {
        String body = mockMvc.perform(get("/api/board/delete/1")
                        .contentType("application/json"))
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));
        assertTrue(body.contains("게시글 삭제 실패"));
    }
}
