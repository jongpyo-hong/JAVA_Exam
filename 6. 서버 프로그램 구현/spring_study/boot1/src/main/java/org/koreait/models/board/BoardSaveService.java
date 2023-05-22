package org.koreait.models.board;

import lombok.RequiredArgsConstructor;
import org.koreait.controllers.board.BoardForm;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardSaveService {

    private final BoardSaveValidator saveValidator;
    private final BoardDao boardDao;
    public void save(BoardForm boardForm) {
        saveValidator.Check(boardForm);

        boardDao.insert(boardForm);

    }
}
