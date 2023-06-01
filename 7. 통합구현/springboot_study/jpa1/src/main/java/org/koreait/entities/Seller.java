package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity @Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class Seller extends BaseEntity {
    @Id @GeneratedValue
    private Long id;

    @Column(length = 60, nullable = false)
    private String storeNm;

    @ManyToMany(mappedBy = "sellers", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Product> products = new ArrayList<>();
}
