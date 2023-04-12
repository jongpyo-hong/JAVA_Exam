package exam01;

public class Student { // 모든 클래스는 extends Object를 컴파일러가 자동 추가한다
    private int id; // 정보은닉
    private String name;

    public Student(int id, String name) { // 생성자
        super(); // Object() (생성자 메서드)
        this.id = id;
        this.name = name;
    }

    public final void method() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override // Object.equals() (동일성 비교)를 동등성 비교로 재정의
    public boolean equals(Object obj) { // Object obj = new Student() ...


        if(obj instanceof Student) {
            Student s = (Student)obj;
            if (id == s.id && name.equals(s.name)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        // this, super
        // name -> String 클래스로 만들어진 객체 name
        return super.hashCode() + id;
        // Object.으로 접근할 수 없다 (static이 아니기 때문), Object로 접근하려면 정적자원(static) 이어야한다
    }
}
