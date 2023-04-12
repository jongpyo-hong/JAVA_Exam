package exam02;

public class Ex01 {
    public static void main(String[] args) {
        try (ResourceExam ex = new ResourceExam()) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
