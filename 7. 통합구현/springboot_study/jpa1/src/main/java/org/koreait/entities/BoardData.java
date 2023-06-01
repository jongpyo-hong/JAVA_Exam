package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;

@Data @Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BoardData extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(nullable = false)
    private String subject;

    @Lob
    @Column(nullable = false)
    private String content;

    @Column(length = 40, nullable = false)
    private String poster;

    @ManyToOne(fetch = FetchType.LAZY) // 다대일, Many : BoardData, One: Member, //(FetchType.LAZY) : 지연 로딩(LAZY) - Global 전략 , 필요할때만 즉시 로딩(EAGER)
    @JoinColumn(name = "user_no")
    @ToString.Exclude
    private Member member;
}
