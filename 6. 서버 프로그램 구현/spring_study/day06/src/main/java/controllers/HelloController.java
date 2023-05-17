package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    /**
     @GetMapping("/hello")
     public String hello(String name, int num1, int num2, boolean agree) {
     System.out.println(name);
     System.out.println(num1+num2);
     System.out.println(agree);
     return "hello";
     } */

    /**
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "nm", required = false) String name) { // @RequestParam 을 입력하면 기본값이 반드시 입력이 되있기 때문에 required = false 로 입력 해줘야 한다
        System.out.println(name);

        return "hello";
    }*/

    @GetMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("title1", "메세지1");
        model.addAttribute("title2", "메세지2");

        return "hello";
    }
}