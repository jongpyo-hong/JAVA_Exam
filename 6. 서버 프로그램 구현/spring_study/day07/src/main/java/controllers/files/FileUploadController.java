package controllers.files;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/file/upload")
public class FileUploadController {
    @GetMapping
    public String upload() {
        return "file/upload";
    }

    @PostMapping
    public String uploadPs(MultipartFile[] files)  {

        for (MultipartFile file : files) {
            String fileName = file.getOriginalFilename(); // 원 파일명
            File path = new File("D:/uploads/" + fileName);

            try {
                file.transferTo(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return "file/upload";
    }
}