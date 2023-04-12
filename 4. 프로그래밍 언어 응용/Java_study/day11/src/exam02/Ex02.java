package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Box<Grape> gbox = new Box<Grape>();
        gbox.setItem(new Grape());
        gbox.printInfo();
    }
}
