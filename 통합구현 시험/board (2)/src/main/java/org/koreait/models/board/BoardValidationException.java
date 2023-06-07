package org.koreait.models.board;

import org.koreait.commons.CommonException;
import org.springframework.http.HttpStatus;

/**
 * 게시글 유효성 검증 예외
 *
 */
public class BoardValidationException extends CommonException {
    public BoardValidationException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
