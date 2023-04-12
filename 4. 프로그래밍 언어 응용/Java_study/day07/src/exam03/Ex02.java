package exam03;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        LoginService service = new LoginService();

        try {
            service.Login("user01","1234");
        } catch (IDNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (PWIncorrectException e) {
            System.out.println(e.getMessage());
        }

    }
}
