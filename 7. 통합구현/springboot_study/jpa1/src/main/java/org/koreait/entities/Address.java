package org.koreait.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class Address extends BaseEntity {
    @Id @GeneratedValue
    private Long id;

    @Column(length = 10, nullable = false)
    private String zipcode;

    @Column(length = 100, nullable = false)
    private String address; // 집 주소

    @Column(length = 100)
    private String addressSub; // 나머지 주소

    @OneToOne(mappedBy = "address", fetch = FetchType.LAZY)
    private Member member;
}
