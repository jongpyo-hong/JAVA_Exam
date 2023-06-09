package org.koreait.restcontrollers;

import lombok.RequiredArgsConstructor;
import org.koreait.controllers.BoardForm;
import org.koreait.entities.BoardData;
import org.koreait.models.board.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardApiController {

    private final BoardSaveService saveService;
    private final BoardInfoService infoService;
    private final BoardListService listService;
    private final BoardDeleteService deleteService;

    @PostMapping("/write")
    public ResponseEntity<Object> write(@RequestBody BoardForm boardForm) {
        saveService.save(boardForm);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/list")
    public ResponseEntity<List<BoardData>> list() {
        List<BoardData> items = listService.gets();

        if (items.isEmpty()) {
            throw new BoardValidationException("게시글 조회 실패");
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
