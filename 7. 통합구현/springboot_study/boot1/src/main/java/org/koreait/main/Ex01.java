package org.koreait.main;

import org.koreait.models.board.Board2;
import org.koreait.models.board.Board3;

public class Ex01 {
    public static void main(String[] args) {
        Board2 board2 = Board2.builder()
                            .id(1L)
                            .subject("제목")
                            .content("내용")
                            .build();

        System.out.println(board2);
    }
}
