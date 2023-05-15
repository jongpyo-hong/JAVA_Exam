package models.emp;

import lombok.*;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor // 모든 생성자의 초기화 값
//@NoArgsConstructor // 기본 생성자
//@RequiredArgsConstructor
@Data
public class Emp {
    private long EMPNO;

    private String ENAME;

    private String JOB;

}
