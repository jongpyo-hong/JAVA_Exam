package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.id = 1000;
        s1.name = "이름1";
        s1.subject = "과목1";

        System.out.println("s1 = " + s1);

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "이름2";
        s2.subject = "과목2";
        System.out.println("s2 = " + s2);
        System.out.println("s1 = " + s1);

        s1.printInfo();
    }
}
