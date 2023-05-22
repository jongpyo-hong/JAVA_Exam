package org.koreait.tests;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.controllers.board.BoardForm;
import org.koreait.models.board.Board;
import org.koreait.models.board.BoardDao;
import org.koreait.models.board.BoardSaveService;
import org.koreait.models.board.BoardValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional // 테스트가 끝나면 DB에 데이터를 지운다
public class BoardSaveTest {

    @Autowired
    private BoardSaveService saveService;

    @Autowired
    private BoardDao boardDao;

    private BoardForm getBoardForm() {
        BoardForm boardForm = new BoardForm();
        boardForm.setSubject("제목");
        boardForm.setContent("내용");
        return boardForm;
    }

    @Test
    @DisplayName("게시글 등록 성공시 예외 없음")
    void registerSuccessTest() {
        assertDoesNotThrow(() -> {
            BoardForm boardForm = getBoardForm();
            saveService.save(boardForm);
        });
    }

    @Test
    @DisplayName("필수 항목(subject, content) 검증 - 실패시 예외 발생")
    void requiredFieldsTest() {
        assertAll(
                () -> assertThrows(BoardValidationException.class, () -> {
                    BoardForm boardForm = getBoardForm();
                    boardForm.setSubject(null);
                    saveService.save(boardForm);
                }),
                () -> assertThrows(BoardValidationException.class, () -> {
                    BoardForm boardForm = getBoardForm();
                    boardForm.setSubject(" ");
                    saveService.save(boardForm);
                }),
                () -> assertThrows(BoardValidationException.class, () -> {
                    BoardForm boardForm = getBoardForm();
                    boardForm.setContent(null);
                    saveService.save(boardForm);
                }),
                () -> assertThrows(BoardValidationException.class, () -> {
                    BoardForm boardForm = getBoardForm();
                    boardForm.setContent(" ");
                    saveService.save(boardForm);
                })
        );
    }

    @Test
    @DisplayName("등록한 게시글이 일치하는지 체크 - 실패시 예외 발생")
    void registerDataTest() {
        BoardForm boardForm = getBoardForm();
        assertDoesNotThrow(() -> {
            boardDao.insert(boardForm);
        });

        Long id = boardForm.getId();
        if (id == null) { // 등록된 게시글 번호가 없으면 실패
            fail();
        }
        Board board = boardDao.get(id);
        if (board == null) { // 조회된 게시글이 없을 때
            fail();
        }

        assertEquals(boardForm.getSubject(), board.getSubject());
        assertEquals(boardForm.getContent(), board.getContent());
    }
}
