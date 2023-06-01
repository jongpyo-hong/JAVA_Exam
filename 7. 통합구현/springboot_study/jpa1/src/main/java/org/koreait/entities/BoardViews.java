package org.koreait.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity @Data
@IdClass(BoardViewsId.class)
public class BoardViews {
    @Id
    private Long id; // 게시글 번호
    @Id
    @Column(name = "uid_")
    private String uid; // 회원 - 회원번호, 비회원 - IP + User-Agent(브라우저 정보)
}
