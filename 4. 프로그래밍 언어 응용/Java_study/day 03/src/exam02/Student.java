package exam02;

public class Student {
    int id; // 학번 - 변수 x 공간을 할당 받지 않았다
    String name; // 이름
    String subject; // 과목
    
    public Student() { // 기본 생성자 : 컴파일러
        // 미리 반환값(주소값)이 결정 되있다
        // 반환값이 있으면 생성자로 객체를 생성할수 없다 (주소가 바뀌면 X)
        // 객체가 생성된 이후 처리할 작업
        // 생성된 객체의 멤버 변수의 초기화 작업을 주로한다

        id = 1000;
        name = "이름1";
        subject = "과목1";
    }

    public Student(int _id, String _name, String _subject) { // 생성자 오버로드
        id = _id;
        name = _name;
        subject = _subject;
    }

    void showInfo() {
        System.out.println("id=" + id + ", name=" + name + ", subject=" + subject);
    }
}
