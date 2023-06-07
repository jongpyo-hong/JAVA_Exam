package org.koreait.entitis;

import jakarta.persistence.*;
import lombok.*;

@Entity @Data @Builder
@AllArgsConstructor @NoArgsConstructor
public class BoardData extends BaseUserEntity {

    @Id @GeneratedValue
    private Long id; // 게시글 번호

    @Column(nullable = false)
    private String subject; // 게시글 제목

    @Column(nullable = false) @Lob
    private String content; // 게시글 내용

    @Column(length = 40, nullable = false)
    private String poster; // 작성자

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_no") // 외래키 이름 설정
    @ToString.Exclude
    private Member member;


}
