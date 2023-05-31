package org.koreait.repositories;

import org.koreait.entities.Member;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, QuerydslPredicateExecutor<Member> {
    // Member findMemberByUserId(String userId); // find + 엔티티명 + By필드명(자료형 필드명)
    Member findByUserId(String userId); // userId=:userId

    List<Member> findByUserNmContaining(String keyword, Pageable pageable); // userNm Like %:keyword:%

    List<Member> findByUserNmContainingOrderByRegDtDesc(String keyword); // ORDER By redDt DESC

    @Query("SELECT m FROM Member m WHERE m.userNm LIKE %:key% ORDER BY m.regDt DESC")
    List<Member> getUsers(@Param("key")String keyword);
}
