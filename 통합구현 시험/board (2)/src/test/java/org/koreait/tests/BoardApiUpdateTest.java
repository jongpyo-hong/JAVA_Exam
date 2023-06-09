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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
@AutoConfigureMockMvc
public class BoardApiUpdateTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private BoardSaveService saveService;

    private String getParams(String subject, String content) {
        String params = String.format("{\"subject\":\"%s\", \"content\":\"%s\"}", subject, content);

        return params;
    }

    private void save() {
        BoardForm boardForm = new BoardForm();
        boardForm.setId(1l);
        boardForm.setSubject("제목");
        boardForm.setContent("내용");
        saveService.save(boardForm);
    }

    @Test
    @DisplayName("게시글 등록 성공시 응답코드 201")
    void updateSuccessTest() throws Exception {
        save();
        BoardForm boardForm = new BoardForm();
        boardForm.setMode("update");
        String params = getParams("제목 (수정)", "내용 (수정)");
        mockMvc.perform(post("/api/board/update/1")
                        .contentType("application/json")
                        .content(params))
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    @DisplayName("제목만 바꿀경우 성공시 응답코드 201")
    void updateSubjectTest() throws Exception {
        save();
        BoardForm boardForm = new BoardForm();
        boardForm.setMode("update");
        String params = getParams("제목(수정)", boardForm.getContent());
        mockMvc.perform(post("/api/board/update/1")
                .contentType("application/json")
                .content(params))
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    @DisplayName("내용만 바꿀경우 성공시 응답코드 201")
    void updateContentTest() throws Exception {
        save();
        BoardForm boardForm = new BoardForm();
        boardForm.setMode("update");
        String params = getParams(boardForm.getSubject(), "내용 (수정)");
        mockMvc.perform(post("/api/board/update/1")
                        .contentType("application/json")
                        .content(params))
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    @DisplayName("필수항목 (제목, 내용)이 없을 경우 발생하는 문구 테스트")
    void requiredSubjectTest() throws Exception {
        save();
        BoardForm boardForm = new BoardForm();
        boardForm.setMode("update");
        String params = getParams("", "내용 (수정)");
        String body = mockMvc.perform(post("/api/board/update/1")
                        .contentType("application/json")
                        .content(params))
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));
        assertTrue(body.contains("제목을 입력"));
    }

    @Test
    @DisplayName("필수항목 (제목, 내용)이 없을 경우 발생하는 문구 테스트")
    void requiredContentTest() throws Exception {
        save();
        BoardForm boardForm = new BoardForm();
        boardForm.setMode("update");
        String params = getParams("제목 (수정)", "");
        String body = mockMvc.perform(post("/api/board/update/1")
                        .contentType("application/json")
                        .content(params))
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));
        assertTrue(body.contains("내용을 입력"));
    }

}
