package org.koreait.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.koreait.entities.BoardData;
import org.koreait.models.board.BoardDeleteService;
import org.koreait.models.board.BoardInfoService;
import org.koreait.models.board.BoardListService;
import org.koreait.models.board.BoardSaveService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.koreait.commons.libs.JavaScript.alertBack;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardSaveService saveService;
    private final BoardInfoService infoService;
    private final BoardListService listService;

    private final BoardDeleteService deleteService;

    // 게시글 작성 양식
    @GetMapping("/write")
    public String write(Model model) {
        BoardForm boardForm = new BoardForm();
        model.addAttribute("boardForm", boardForm);
        model.addAttribute("addScript", new String[]{"ckeditor/ckeditor", "form"});
        return "board/write";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") Long id, Model model) {

        BoardData boardData = infoService.get(id);

        BoardForm boardForm = new ModelMapper().map(boardData, BoardForm.class);
        model.addAttribute("boardForm", boardForm);
        model.addAttribute("addScript", new String[]{"ckeditor/ckeditor", "form"});

        return "board/update";
    }

    // 게시글 작성 및 수정 처리
    @PostMapping("/save")
    public String save(@Valid BoardForm boardForm, Errors errors) {

        try {
            saveService.save(boardForm, errors);
        } catch (Exception e) {
            errors.reject("boardSaveErr", e.getMessage());
        }

        if (errors.hasErrors()) {
            Long id = boardForm.getId();
            if (id == null) {
                return "board/write";
            } else {
                return "board/update";
            }
        }

        return "redirect:/board/list";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") Long id, Model model) {

        BoardData boardData = infoService.get(id);
        model.addAttribute("boardData", boardData);

        return "board/view";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<BoardData> list = listService.gets();

        model.addAttribute("list", list);

        return "board/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        deleteService.delete(id);

        return "redirect:/board/list";
    }


    @ExceptionHandler(Exception.class)
    public String errorHandler(Exception e, Model model) {
        model.addAttribute("scripts", alertBack(e.getMessage()));
        return "commons/execute_script";
    }
}
