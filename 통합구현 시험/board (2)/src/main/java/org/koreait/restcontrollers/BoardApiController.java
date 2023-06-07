package org.koreait.restcontrollers;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.koreait.controllers.BoardForm;
import org.koreait.entities.BoardData;
import org.koreait.models.board.BoardDeleteService;
import org.koreait.models.board.BoardInfoService;
import org.koreait.models.board.BoardListService;
import org.koreait.models.board.BoardSaveService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Log
@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardApiController {

    private final BoardSaveService saveService;
    private final BoardInfoService infoService;
    private final BoardListService listService;
    private final BoardDeleteService deleteService;


    @PostMapping("/write")
    public ResponseEntity<Object> write(@RequestBody BoardForm boardForm) { // 요청을 json 형식으로
        //log.info(boardForm.toString());

        saveService.save(boardForm);

        return ResponseEntity.status(HttpStatus.CREATED).build(); // CREATED : 201
    }

}
