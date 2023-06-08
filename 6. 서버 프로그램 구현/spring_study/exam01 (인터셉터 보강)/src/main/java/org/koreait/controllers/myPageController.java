package org.koreait.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mypage")
public class myPageController {

    @GetMapping
    public String index(HttpServletRequest request) {
        String commonData = (String)request.getAttribute("commonData");
        System.out.println(commonData);
        return "mypage";
    }
}
