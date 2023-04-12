package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Box abox = new Box();
        abox.setItem(apple);

        Object thing = abox.getItem();
        if (thing instanceof Grape) {
            Grape grape = (Grape)thing;
        }

    }
}
