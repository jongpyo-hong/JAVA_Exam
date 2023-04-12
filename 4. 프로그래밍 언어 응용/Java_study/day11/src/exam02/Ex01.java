package exam02;

public class Ex01 {
    public static void main(String[] args) {

        Box<Apple> abox = new Box<Apple>();
        // Box<Grape> abox = new Box<Grape>(); // 타입이 다르면 X
        // Box<Object> abox = new Box<Object>(); // 다형성 O

        abox.setItem(new Apple());
        Apple apple = abox.getItem();
        abox.printInfo();
    }
}
