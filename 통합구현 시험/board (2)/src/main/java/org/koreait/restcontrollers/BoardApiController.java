package org.koreait.restcontrollers;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.koreait.controllers.BoardForm;
import org.koreait.entities.BoardData;
import org.koreait.models.board.*;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/list")
    public ResponseEntity<List<BoardData>> list() {
        List<BoardData> items = listService.gets();

        if (items.isEmpty()) {
            throw new BoardValidationException("게시글 불러오기 실패");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(items);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<BoardData> get(@PathVariable Long id) {

        BoardData item = infoService.get(id);

        return ResponseEntity.status(HttpStatus.CREATED).body(item);
    }
    @GetMapping("/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        deleteService.delete(id);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody BoardForm boardForm) {

        boardForm.setId(id);
        boardForm.setMode("update");
        saveService.save(boardForm);

        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

}
