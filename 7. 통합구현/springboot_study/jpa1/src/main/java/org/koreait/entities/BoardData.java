package org.koreait.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

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
}
