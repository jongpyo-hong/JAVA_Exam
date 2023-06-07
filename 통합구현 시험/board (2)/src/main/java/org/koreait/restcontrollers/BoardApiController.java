package org.koreait.restcontrollers;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.koreait.controllers.BoardForm;
import org.koreait.models.board.BoardSaveService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log
@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardApiController {

    private final BoardSaveService saveService;

    @PostMapping("/write")
    public ResponseEntity<Object> write(@RequestBody BoardForm boardForm) { // 요청을 json 형식으로
        //log.info(boardForm.toString());

        saveService.save(boardForm);

        return ResponseEntity.status(HttpStatus.CREATED).build(); // CREATED : 201
    }
}
