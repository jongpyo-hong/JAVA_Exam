package controllers;

import lombok.Data;

import javax.validation.constraints.*;
import java.util.List;

@Data
public class JoinForm { // 커맨드 객체
    @NotBlank
    @Size(min=6, max=16)
    private String userId;

    @NotBlank
    @Size(min=8)
    private String userPw;

    @NotBlank
    private String userPwRe;

    @NotBlank
    private String userNm;

    @AssertTrue
    private boolean agree;

    private Address address;

    private List<String> hobby;
}
