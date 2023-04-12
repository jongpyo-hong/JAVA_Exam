package exam06;

public class Ex01 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Box aBox = new Box();
        aBox.setItem(apple);

        Apple apple2 = (Apple)aBox.getItem();
        apple2.info();

        Grape grape = new Grape();
        Box gBox = new Box();
        gBox.setItem(grape);
    }
}
