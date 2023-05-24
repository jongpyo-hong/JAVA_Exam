package org.koreait.models.board;

import org.koreait.commons.CommonException;
import org.springframework.http.HttpStatus;

public class BoardValidationException extends CommonException {
    public BoardValidationException(String message) {

        super(message, HttpStatus.BAD_REQUEST);
    }
}
