package org.koreait.models.board;

public class BoardValidationException extends RuntimeException {
    public BoardValidationException(String message) {
        super(message);
    }
}
