package org.koreait.models.board;

import lombok.RequiredArgsConstructor;
import org.koreait.entities.BoardData;
import org.koreait.repositories.BoardDataRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardDeleteService {
    private final BoardDataRepository repository;

    public void delete(Long id) {
        BoardData boardData = repository.findById(id).orElseThrow(()->new BoardValidationException("게시글 삭제 실패"));

        repository.delete(boardData);
        repository.flush();
    }
}
