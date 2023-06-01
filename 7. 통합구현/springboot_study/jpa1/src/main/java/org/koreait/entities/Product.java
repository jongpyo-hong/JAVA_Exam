package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity @Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class Product extends BaseEntity {
    @Id @GeneratedValue
    private Long id;

    @Column(length = 100, nullable = false)
    private String productNm;

    @ManyToMany(fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Seller> sellers = new ArrayList<>();
}
