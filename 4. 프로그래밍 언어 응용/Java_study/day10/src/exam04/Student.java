package exam04;

@MyAnno // 구현체가 value 하나뿐이면 (value =)를 생략가능, default 값을 애너테이션에 정의 해놓으면 명시하지 않아도 된다
public class Student {
    private int id;
    @MyAnno
    public void method(@MyAnno int num1) {

    }
}
