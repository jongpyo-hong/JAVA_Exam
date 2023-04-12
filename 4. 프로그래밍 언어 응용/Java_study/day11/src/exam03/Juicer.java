package exam03;

import java.util.List;

public class Juicer {

    // <?> -> 와일드 카드는 메서드가 호출될 때 결정된다, static도 사용가능
    public static void make(Box<? extends Fruit> fruits) { // 상한제한
        List<?> items = fruits.getItems();
        System.out.println(items);
    }

    public static <T extends Fruit> void make3(Box<T> fruits) { // 지네릭 메서드
        List<T> items = fruits.getItems();
        System.out.println(items);
    }

    // Apple, Fruit, Object
    public static void make2(Box<? super Apple> fruits) { // Apple를 포함한 상위클래스로 제한, super(하한제한)
        List<?> items = fruits.getItems();
        System.out.println(items);
    }


    /*
    public static void make(Box<Apple> apples) {
        List<Apple> items = apples.getItems();
        System.out.println(items);
    }

    public static void make(Box<Grape> grapes) {
        List<Grape> items = grapes.getItems();
        System.out.println(items);
    }
    */
}
