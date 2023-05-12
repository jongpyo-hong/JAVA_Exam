package exam02;

public class Message {
    public void send(String message) {
        System.out.println(message);
    }

    public void init() {
        System.out.println("init()");
    }

    public void close() {
        System.out.println("close()");
    }
}
