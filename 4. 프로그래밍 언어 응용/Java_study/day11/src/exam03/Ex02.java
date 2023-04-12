package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Box<Fruit> grapes = new Box<>();

        grapes.add(new Grape());
        grapes.add(new Grape());
        grapes.add(new Grape());

        Juicer.make2(grapes); // Apple, Fruit, Object
    }
}
