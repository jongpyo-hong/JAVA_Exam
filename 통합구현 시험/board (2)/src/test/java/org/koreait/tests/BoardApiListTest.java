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
@TestPropertySource(locations = "classpath:application-test.properties")
@AutoConfigureMockMvc
public class BoardApiListTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private BoardSaveService saveService;

    private void getParams() {
        for(long i = 1; i <= 5; i++ ) {
            BoardForm boardForm = new BoardForm();
            boardForm.setId(i);
            boardForm.setSubject("제목" + i);
            boardForm.setContent("내용" + i);
            saveService.save(boardForm);
        }
    }

    @Test
    @DisplayName("게시글 목록 조회 성공시 상태코드 201, 게시글 출력")
    void listSuccessTest() throws Exception {
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
    @DisplayName("게시글 목록 조회 실패시 메세지 출력")
    void listFailedTest() throws Exception {
        String body = mockMvc.perform(get("/api/board/get/1000000")
                        .contentType("application/json"))
                .andReturn()        // 응답 바디를 반환 해주는 명령
                .getResponse()      // 응답 바디
                .getContentAsString(Charset.forName("UTF-8")); // 응답 Body 데이터를 문자열로 반환한다
        assertTrue(body.contains("게시글 조회 실패"));
    }

}
