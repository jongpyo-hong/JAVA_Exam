package org.koreait.restcontrollers;

import org.koreait.commons.CommonException;
import org.koreait.commons.rest.JSONResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice("org.koreait.restcontrollers")
public class CommonRestController {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<JSONResult> errorHandler(Exception e) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        if (e instanceof CommonException) {
                CommonException commonException = (CommonException)e;
                status = commonException.getStatus();
        }

        JSONResult jsonResult = new JSONResult();
        jsonResult.setStatus(status);
        jsonResult.setErrorMessage(e.getMessage());

        e.printStackTrace();

        return ResponseEntity.status(status).body(jsonResult);
    }
}
