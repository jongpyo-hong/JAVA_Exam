package exam03;

import java.util.ArrayList;
import java.util.List;

public class Box<T> { // 지네릭 클래스 -> T는 인스턴스가 생성될 때 결정된다
    // private static T staticItem; -> static은 자료형이 없기때문에 사용불가

    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}
