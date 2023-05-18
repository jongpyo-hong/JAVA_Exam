package controllers;

import lombok.Data;

import java.util.List;

@Data
public class JoinForm { // 커맨드 객체
    private String userId;
    private String userPw;
    private String userPwRe;
    private String userNm;
    private boolean agree;

    private Address address;

    private List<String> hobby;
}
