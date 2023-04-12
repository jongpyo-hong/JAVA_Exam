package exam03;

public class Ex02 {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("exam03.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
