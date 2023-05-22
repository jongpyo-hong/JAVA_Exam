package org.koreait.controllers.board;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BoardForm {
    private Long id;

    @NotBlank
    private String subject;

    @NotBlank
    private String content;
}
