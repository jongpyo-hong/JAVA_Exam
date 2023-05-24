package org.koreait.models.board;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
=======
>>>>>>> 61fd14af1414e60d0cd581d87688cf376330dbbb
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Board {
<<<<<<< HEAD

    @JsonIgnore
    private Long id;
    private String subject;
    private String content;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
=======
    private Long id;
    private String subject;
    private String content;
>>>>>>> 61fd14af1414e60d0cd581d87688cf376330dbbb
    private LocalDateTime regDt;
}
