package exam2_Optional;

import java.util.Optional;

public class Ex01 {
    public static void main(String[] args) {
        //Optional<String> opt = Optiocal.of(null); // 예외발생
        Optional<String> opt = Optional.ofNullable(null); // null값 허용

        //String str = opt.get(); // 예외발생
        //String str = opt.orElse("기본값"); // 값이 없으면 기본값 출력
        //String str = opt.orElseGet(() -> "기본값"); // 값이 없으면 기본값 출력
        //String str = opt.orElseThrow(); // 예외발생
        //String str = opt.orElseThrow(() -> new RuntimeException("예외발생"));
        if (opt.isPresent()) {
            String str = opt.get();
            System.out.println(str);
        }
    }
}
