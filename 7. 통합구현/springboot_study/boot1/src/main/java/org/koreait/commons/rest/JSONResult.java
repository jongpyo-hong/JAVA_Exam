package org.koreait.commons.rest;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class JSONResult<T> {
    private HttpStatus status = HttpStatus.OK; // spring 의 응답 코드가 담겨있는 Enum 클래스
    private boolean success; // 응답 성공, 실패에 대한 변수
    private String message; // 실패에 대한 메세지
    private T data; // 응답 성공 데이터
}
