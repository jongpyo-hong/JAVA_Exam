package org.koreait.models.board;

/**
 * 게시글 유효성 검증 예외
 *
 */
public class BoardValidationException extends RuntimeException {
    public BoardValidationException(String message) {
        super(message);
    }
}
