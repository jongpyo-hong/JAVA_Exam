package org.koreait.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
@AutoConfigureMockMvc
public class BoardApiSaveTest {
    @Autowired
    private MockMvc mockMvc;

    private String getParams(String subject, String content) {
        String params = String.format("{\"subject\":\"%s\", \"content\":\"%s\"}", subject, content);
        return params;
    }

    @Test
    @DisplayName("게시글 작성 성공시 응답 코드 201")
    void saveSuccessTest() throws Exception {
        String params = getParams("테스트 제목", "테스트 내용");
        mockMvc.perform(post("/api/board/write") // 작동할 url 주소
                .contentType("application/json") // contentType json 으로 설정
                .content(params)) // request body
                .andDo(print()) // 요청과 응답의 데이터를 출력하는 기능 MockMvcResultHandlers.print (출력기능)
                .andExpect(status().isCreated()); // assertTrue
    }

    @Test
    @DisplayName("필수항목(제목)이 없을 경우 발생하는 문구 테스트")
    void requiredSubjectTest() throws Exception {
        String params = getParams("", "테스트 내용");
        String body = mockMvc.perform(post("/api/board/write")
                .contentType("application/json")
                .content(params))
                .andReturn()        // 응답 바디를 반환 해주는 명령
                .getResponse()      // 응답 바디
                .getContentAsString(Charset.forName("UTF-8")); // 응답 Body 데이터를 문자열로 반환한다
        assertTrue(body.contains("제목을 입력"));
    }

    @Test
    @DisplayName("필수항목(내용)이 없을 경우 발생하는 문구 테스트")
    void requiredContentTest() throws Exception {
        String params = getParams("테스트 제목", "");
        String body = mockMvc.perform(post("/api/board/write")
                .contentType("application/json")
                .content(params))
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));
        assertTrue(body.contains("내용을 입력"));
        System.out.println(body);
    }
}
