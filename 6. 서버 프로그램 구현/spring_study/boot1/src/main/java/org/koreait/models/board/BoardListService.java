package org.koreait.models.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardListService {
    private final BoardDao boardDao;

    public List<Board> gets() {

        return boardDao.gets();
    }
}
