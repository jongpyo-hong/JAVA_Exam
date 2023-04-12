package exam03;

public class Ex01 {
    public static void main(String[] args) throws IDNotFoundException, PWIncorrectException {
        LoginService service = new LoginService();
        try {
            service.Login("user","1234");

            System.out.println("실행코드");
        } catch (IDNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (PWIncorrectException e) {
            System.out.println(e.getMessage());
        }
    }
}
