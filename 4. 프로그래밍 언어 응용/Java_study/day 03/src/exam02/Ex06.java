package exam02;

public class Ex06 {
    public static void main(String[] args) { // 생성자 오버로드
        Student s1 = new Student(1001, "이름2", "과목2");
        Student s2 = new Student(1002,"이름3","과목3");

        s1.showInfo();
        s2.showInfo();

    }
}
