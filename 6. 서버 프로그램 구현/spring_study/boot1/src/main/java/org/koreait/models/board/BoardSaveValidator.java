package org.koreait.models.board;

import org.koreait.controllers.board.BoardForm;
import org.koreait.validators.Validator;
import org.springframework.stereotype.Component;

@Component
public class BoardSaveValidator implements Validator<BoardForm> {
    @Override
    public void Check(BoardForm boardForm) {
        requiredCheck(boardForm.getSubject(), new BoardValidationException("제목을 입력하세요."));
        requiredCheck(boardForm.getContent(), new BoardValidationException("내용을 입력하세요."));
    }
}
