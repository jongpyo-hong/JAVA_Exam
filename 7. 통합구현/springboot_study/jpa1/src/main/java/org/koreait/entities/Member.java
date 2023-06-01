package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.koreait.constants.MemberType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data @Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users", indexes = {
        @Index(name="idx_member_usernm", columnList = "userNm")
}) // 테이블 명이 users로 생성 (엔티티명 과 테이블 명이 다를 경우)
public class Member extends BaseEntity{
    @Id
    //@TableGenerator(name = "user_seq")
    //@GeneratedValue(strategy = GenerationType.TABLE)
    @GeneratedValue(strategy = GenerationType.AUTO) // 기본값
    private Long userNo; // 회원번호

    @Column(length = 45, nullable = false, unique = true) // userId에 unique 제약조건이 걸린다
    private String userId; // 회원 아이디

    @Column(length = 65, nullable = false, name="userPass") // 실제 테이블의 필드명 userPass 이지만 엔티티는 userPw
    private String userPw; // 회원 비밀번호

    @Column(length = 40, nullable = false)
    private String userNm; // 회원명

    //@Lob // String - CLOB
    @Transient // 엔티티 내부에서만 사용되는 항목 - 테이블 필드로 반영되지 않는다
    private String introduction; // 자기소개

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private MemberType memberType;

    @Temporal(TemporalType.DATE) // 날짜와 시간
    private Date birthDt;

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY) // BoardData에 정의되어 있는 member
    private List<BoardData> boarDatas = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    @ToString.Exclude
    private Address address;
}
