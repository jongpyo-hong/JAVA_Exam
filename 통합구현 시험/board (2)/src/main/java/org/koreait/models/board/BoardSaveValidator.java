package org.koreait.models.board;

import lombok.RequiredArgsConstructor;
import org.koreait.commons.validators.Validator;
import org.koreait.controllers.BoardForm;
import org.koreait.repositories.BoardDataRepository;
import org.springframework.stereotype.Component;

/**
 * 게시글 저장 유효성 검사
 *
 */
@Component
@RequiredArgsConstructor
public class BoardSaveValidator implements Validator<BoardForm> {

    private final BoardDataRepository repository;

    @Override
    public void check(BoardForm boardForm) {
        Long id = boardForm.getId();
        String mode = boardForm.getMode();
        String subject = boardForm.getSubject();
        String content = boardForm.getContent();

        // 게시글 수정인 경우
        if (mode != null && mode.equals("update")) {
            if (id == null) { // 게시글 번호 필수 체크
                nullCheck(id, new BoardValidationException("잘못된 접근입니다."));
            }

            // 게시글 등록 여부 체크
            if (!repository.exists(id)) {
                throw new BoardValidationException("등록되지 않은 게시글 입니다.");
            }
        }

        requiredCheck(subject, new BoardValidationException("제목을 입력하세요."));
        requiredCheck(content, new BoardValidationException("내용을 입력하세요."));
    }
}
