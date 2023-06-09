package org.koreait.models.board;

import lombok.RequiredArgsConstructor;
import org.koreait.controllers.BoardForm;
import org.koreait.entities.BoardData;
import org.koreait.repositories.BoardDataRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

/**
 * 게시글 저장 서비스
 *
 */
@Service
@RequiredArgsConstructor
public class BoardSaveService {

    private final BoardDataRepository repository;
    private final BoardSaveValidator validator;

    public void save(BoardForm boardForm) {
        save(boardForm, null);
    }

    public void save(BoardForm boardForm, Errors errors) {
        if (errors != null && errors.hasErrors()) {
            return;
        }

        validator.check(boardForm);

        BoardData boardData = null;
        // 게시글 수정
        String mode = boardForm.getMode();
        Long id = boardForm.getId();
        if (mode != null && mode.equals("update") && id != null) {
            boardData = repository.findById(id).orElse(null);
            boardData.setSubject(boardForm.getSubject());
            boardData.setContent(boardForm.getContent());
        }

        if (boardData == null) { // 게시글 추가
            boardData = BoardForm.of(boardForm);
        }

        repository.saveAndFlush(boardData);
    }
}
