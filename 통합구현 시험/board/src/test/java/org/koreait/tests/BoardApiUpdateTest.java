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
public class BoardApiUpdateTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private BoardSaveService saveService;

    private String getParams(String subject, String content) {
        String params = String.format("{\"subject\":\"%s\", \"content\": \"%s\"}", subject, content);
        return params;
    }

    private void save() {
        BoardForm boardForm = new BoardForm();
        boardForm.setId(1l);
        boardForm.setSubject("게시글 제목");
        boardForm.setContent("게시글 내용");
        saveService.save(boardForm);
    }


    @Test
    @DisplayName("게시글 수정 성공시 응답코드 201")
    void successUpdateTest() throws Exception {
        save();
        BoardForm item = new BoardForm();
        item.setMode("update");

        String params = getParams("게시글 제목 (수정)", "게시글 내용 (수정)");
        mockMvc.perform(post("/api/board/update/1")
               .contentType("application/json")
               .content(params))
               .andDo(print())
               .andExpect(status().isCreated());
    }

    @Test
    @DisplayName("게시글 수정 (제목만) 성공시 응답코드 201")
    void subjectUpdateTest() throws Exception {
        save();
        BoardForm item = new BoardForm();
        item.setMode("update");

        String params = getParams("게시글 제목 (수정)", item.getContent());
        mockMvc.perform(post("/api/board/update/1")
                        .contentType("application/json")
                        .content(params))
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    @DisplayName("게시글 수정 (내용만) 성공시 응답코드 201")
    void contentUpdateTest() throws Exception {
        save();
        BoardForm item = new BoardForm();
        item.setMode("update");

        String params = getParams(item.getSubject(),"게시글 내용 (수정)");
        mockMvc.perform(post("/api/board/update/1")
                        .contentType("application/json")
                        .content(params))
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    @DisplayName("필수 항목(제목)이 없을시 에러메세지")
    void requiredSubjectTest() throws Exception {
        save();
        BoardForm item = new BoardForm();
        item.setMode("update");

        String params = getParams("", " 게시글 내용 (수정)");
        String body = mockMvc.perform(post("/api/board/write")
                        .contentType("application/json")
                        .content(params))
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));
        assertTrue(body.contains("제목을 입력"));
    }

    @Test
    @DisplayName("필수 항목(내용)이 없을시 에러메세지")
    void requiredContentTest() throws Exception {
        save();
        BoardForm item = new BoardForm();
        item.setMode("update");

        String params = getParams("게시글 제목", "");
        String body = mockMvc.perform(post("/api/board/write")
                        .contentType("application/json")
                        .content(params))
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));
        assertTrue(body.contains("내용을 입력"));
    }

}
