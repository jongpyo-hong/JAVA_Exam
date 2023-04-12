package exam02;

public class Box<T extends Fruit> { // T는 Fruit를 포함한 하위 클래스

    // private T[] items = new T[3]; // 배열을 생성시 명확하게 자료형이 있어야한다
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void printInfo() {
        item.info(); // Fruit item.info();
    }
}
