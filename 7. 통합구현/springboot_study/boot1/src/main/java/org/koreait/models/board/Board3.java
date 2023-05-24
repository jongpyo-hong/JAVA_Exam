package org.koreait.models.board;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter @Setter
@ToString
public class Board3 {
    private Long id;
    private String subject;
    private String content;
}
