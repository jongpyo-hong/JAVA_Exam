package org.koreait.models.board;

import lombok.RequiredArgsConstructor;
import org.koreait.entities.BoardData;
import org.koreait.repositories.BoardDataRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardListService {

    private final BoardDataRepository repository;

    public List<BoardData> gets() {

        return repository.findAll(Sort.by(Sort.Order.desc("regDt")));
    }

}
