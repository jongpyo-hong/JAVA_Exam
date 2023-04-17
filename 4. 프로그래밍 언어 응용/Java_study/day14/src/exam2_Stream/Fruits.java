package exam2_Stream;

public class Fruits implements Comparable<Fruits> {

    protected int price;

    @Override
    public int compareTo(Fruits o) {
        return price - o.price; // 오름차순
    }
}
