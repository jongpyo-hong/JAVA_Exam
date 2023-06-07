package org.koreait.repositories;

import org.koreait.entities.BoardData;
import org.koreait.entities.QBoardData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface BoardDataRepository extends JpaRepository<BoardData, Long>, QuerydslPredicateExecutor {

    /**
     * 게시글 등록 여부 체크
     * @param id
     * @return
     */
    default boolean exists(Long id) {
        QBoardData boardData = QBoardData.boardData;
        return exists(boardData.id.eq(id));
    }
}
