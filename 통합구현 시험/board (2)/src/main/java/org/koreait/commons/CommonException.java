package org.koreait.commons;

import org.springframework.http.HttpStatus;

public class CommonException extends RuntimeException {
    private HttpStatus status;

    public CommonException(String message, HttpStatus status) {
        super(message);

        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
