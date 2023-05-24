package org.koreait.models.board;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Board {

    @JsonIgnore
    private Long id;
    private String subject;
    private String content;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime regDt;
}
