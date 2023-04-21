package exam2_Standard_File;

import java.io.File;

public class Ex06 {
    public static void main(String[] args) {
        String path = "D:" + File.separator + "tmp";
        File file = new File(path);
        System.out.printf("디렉토리? %s%n", file.isDirectory());
    }
}
