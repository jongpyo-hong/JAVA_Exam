package org.koreait.restcontrollers;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.koreait.commons.rest.JSONResult;
import org.koreait.controllers.board.BoardForm;
import org.koreait.models.board.Board;
import org.koreait.models.board.BoardDao;
import org.koreait.models.board.BoardListService;
import org.koreait.models.board.BoardSaveService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Log
@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardApiController {

    private final BoardListService listService;
    private final BoardDao boardDao;
    private final BoardSaveService saveService;

    /**
    @GetMapping("/list")
    public List<Board> list() {
        List<Board> items = listService.gets();

        return items;
    }
     */
    @GetMapping("/list")
    public ResponseEntity<JSONResult<List<Board>>> list() {
        List<Board> items = listService.gets();
        JSONResult<List<Board>> jsonResult = new JSONResult<>();
        jsonResult.setSuccess(true);
        jsonResult.setData(items);

        return ResponseEntity.ok(jsonResult);
    }

    @GetMapping("/view/{id}")
    public Board info(@PathVariable Long id) {
        Board board = boardDao.get(id);

        return board;
    }

    @GetMapping("/nobody")
    public void nobody() {

    }

    @GetMapping("/hello")
    public String hello() {

        return "안녕하세요";
    }

    /**
    @PostMapping("/write")
    public void write(@RequestBody BoardForm boardForm) {
        log.info(boardForm.toString());

        saveService.save(boardForm);
    }
    */

    @PostMapping("/write")
    public ResponseEntity<BoardForm> write(@RequestBody BoardForm boardForm) {

        saveService.save(boardForm);

        //return ResponseEntity.status(HttpStatus.CREATED).body(boardForm); // 응답 바디가 있고, 응답코드를 201로 바꾼다

        //return ResponseEntity.status(HttpStatus.CREATED).build(); // 응답 바디가 없고, 응답 코드를 201로 바꾼다

        //return ResponseEntity.created(URI.create("/board/list")).build();

        return ResponseEntity.noContent().build();
    }


}
