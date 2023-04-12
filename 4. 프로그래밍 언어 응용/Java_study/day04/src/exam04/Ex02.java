package exam04;

public class Ex02 {
    public static void main(String[] args) {
        Student.id = 1000;
        System.out.println(Student.id);
        
        Student.printStaticInfo(); // s1이라는 객체를 생성하지 않아도, Student의 메서드로 바로 사용가능
    }
}
