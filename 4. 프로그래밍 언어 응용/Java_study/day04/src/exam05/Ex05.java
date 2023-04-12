package exam05;

public class Ex05 {
    public static void main(String[] args) {
       /** Company c1 = new Company();
        Company c2 = new Company();*/

       Company c1 = Company.getInstance();

       Company c2 = Company.getInstance();
       System.out.println(c1==c2);
    }
}
