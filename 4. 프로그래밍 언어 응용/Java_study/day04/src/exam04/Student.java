package exam04;

public class Student {
    static int id; // 데이터 메모리에 미리 할당

    String name; // 힙 메모리에 할당

    String subject; // 힙 메모리에 할당

    public void printInfo() { // 인스턴스
        System.out.println("인스턴스 메서드");
        name = "이름";

        id = 1000; // 정적 클래스, 변수 사용가능
        staticMethod(); // 정적 메서드 사용가능
    }

    public static void printStaticInfo() { // static 변수 ,메서드 사용가능
        System.out.println("정적 메서드(클래스 메서드)");
        // this.printInfo(); -> 사용 불가
        // this.name -> 사용 불가
        Student.id = 1000;
        Student.staticMethod();
    }

    public static void staticMethod() {

    }
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
