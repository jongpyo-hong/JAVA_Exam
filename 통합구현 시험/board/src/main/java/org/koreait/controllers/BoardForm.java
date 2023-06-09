package org.koreait.controllers;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.koreait.entities.BoardData;
import org.modelmapper.ModelMapper;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
public class BoardForm {

    private Long id;

    private String mode;  // update이면 수정 처리
    
    @NotBlank
    private String subject;

    @NotBlank
    private String content;

    public static BoardData of(BoardForm boardForm) {
        return new ModelMapper().map(boardForm, BoardData.class);
    }
}
