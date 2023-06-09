package org.koreait.commons.rest;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class JSONResult {
    private HttpStatus status;
    private String errorMessage;
}
