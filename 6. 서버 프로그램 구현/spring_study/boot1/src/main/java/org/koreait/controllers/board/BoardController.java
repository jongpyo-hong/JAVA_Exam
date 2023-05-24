package org.koreait.controllers.board;

import jakarta.validation.Valid;
import org.koreait.models.board.Board;
import org.koreait.models.board.BoardListService;
import org.koreait.models.board.BoardSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardSaveService saveService;
    @Autowired
    private BoardListService listService;
    @GetMapping("/write")
    public String write(@ModelAttribute BoardForm boardForm) {

        return "board/write";
    }

    @PostMapping("/save")
    public String save(@Valid BoardForm boardForm, Errors errors) {
        if(errors.hasErrors()) {
            return "board/write";
        }

        // 저장 처리
        saveService.save(boardForm);

        return "redirect:/board/list"; // 작성 완료 후 목록으로 이동
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Board> items = listService.gets();
        model.addAttribute("items", items);

        return "board/list";
    }

    @GetMapping("/view")
    public String view(@PathVariable Long id) {

        return "board/view";
    }
<<<<<<< HEAD

    @ResponseBody // : Content-Type 을 application/json 형태로 반환한다
    @GetMapping("/list2")
    public List<Board> list2() {
        List<Board> items = listService.gets();

        return items;
    }
=======
>>>>>>> 61fd14af1414e60d0cd581d87688cf376330dbbb
}
