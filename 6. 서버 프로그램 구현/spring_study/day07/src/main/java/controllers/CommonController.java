package controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("controllers")
public class CommonController {
    @ExceptionHandler(Exception.class)
    public String errorHandler(Exception e, Model model) {
        model.addAttribute("message", e.getMessage());

        e.printStackTrace();
<<<<<<< HEAD
        return "error/common";
    }
}
=======

        return "error/common";
    }
}
>>>>>>> 61fd14af1414e60d0cd581d87688cf376330dbbb
