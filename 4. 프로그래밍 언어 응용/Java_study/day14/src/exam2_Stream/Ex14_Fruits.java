package exam2_Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Ex14_Fruits {
    public static void main(String[] args) {
        List<Apple> apples = IntStream.rangeClosed(1, 10)
                .mapToObj(n -> new Apple(1000 * (int)(Math.random() * n))).toList();

        Comparator<Fruits> appleComp = (a, b)-> b.compareTo(a); // 내림차순

        List<Apple> apples2 = apples.stream().sorted(appleComp).toList(); // Apple, Fruits, Object
                                                                // Comparator<Apple>, Comparator<Fruit>...
                                                                // Comparator<? super T> // ? - Apple, Fruit, Object
        for(Apple apple : apples2) {
            System.out.println(apple);
        }

        System.out.println("===========================================");

        List<Melon> melons = IntStream.rangeClosed(1, 10)
                .mapToObj(n -> new Melon(1000 * (int)(Math.random() * n))).toList();

        List<Melon> melon2 = melons.stream().sorted(appleComp).toList(); // Melon, Fruits, Object
                                                                // Comparator<Melon>, Comparator<Fruit>....
        for(Melon melon : melon2){
            System.out.println(melon);
        }

    }
}
