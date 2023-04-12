package exam03;

public class Ex03 {
    public static void main(String[] args) {
        Animal human = new Human();
        human.move(); // 하위클래스부터 조회한 후 있으면 호출 없으면 상위클래스에 가서 조회한후 호출
    }
}
