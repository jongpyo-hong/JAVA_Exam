package exam02;

public class ResourceExam implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("자원 해제");
    }
}
