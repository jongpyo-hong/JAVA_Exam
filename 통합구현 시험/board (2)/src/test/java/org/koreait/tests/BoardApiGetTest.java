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
@TestPropertySource(locations = "classpath:application-test.properties")
@AutoConfigureMockMvc
public class BoardApiGetTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private BoardSaveService saveService;

    private void getParams() {
            BoardForm boardForm = new BoardForm();
            boardForm.setId(1l);
            boardForm.setSubject("게시글 제목");
            boardForm.setContent("게시글 내용");
            saveService.save(boardForm);
    }

    @Test
    @DisplayName("게시글 조회 성공시 응답코드 201, 게시글 조회")
    void getSuccessTest() throws Exception {
        getParams();
        String body = mockMvc.perform(get("/api/board/get/1")
                        .contentType("application/json"))
                .andDo(print())
                .andExpect(status().isCreated())
                .andReturn()        // 응답 바디를 반환 해주는 명령
                .getResponse()      // 응답 바디
                .getContentAsString(Charset.forName("UTF-8")); // 응답 Body 데이터를 문자열로 반환한다
        System.out.println(body);
    }

    @Test
    @DisplayName("게시글 조회 실패시 에러 메세지")
    void getFailedTest() throws Exception {
        String body = mockMvc.perform(get("/api/board/list")
                        .contentType("application/json"))
                .andReturn()        // 응답 바디를 반환 해주는 명령
                .getResponse()      // 응답 바디
                .getContentAsString(Charset.forName("UTF-8")); // 응답 Body 데이터를 문자열로 반환한다
        assertTrue(body.contains("게시글 불러오기 실패"));
    }
}
