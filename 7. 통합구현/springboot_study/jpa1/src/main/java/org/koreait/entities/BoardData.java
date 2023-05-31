package org.koreait.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table
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

    @ManyToOne
    @JoinColumn(name="user_no")
    @ToString.Exclude
    private Member member;
}
