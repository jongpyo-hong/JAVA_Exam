package controllers;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class SearchForm {
<<<<<<< HEAD
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate sdate;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate edate;
}
=======
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate sdate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate edate;
}
>>>>>>> 61fd14af1414e60d0cd581d87688cf376330dbbb
