package org.koreait.main;

import org.koreait.models.board.Board3;

public class Ex02 {
    public static void main(String[] args) {
        Board3 board3 = Board3.builder()
                                .id(1L)
                                .subject("제목1")
                                .content("내용1")
                                .build();

        System.out.println(board3);
    }
}
