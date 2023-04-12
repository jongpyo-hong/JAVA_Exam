package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();
        System.out.println("c1 = " + System.identityHashCode(c1));
        System.out.println("c2 = " + System.identityHashCode(c2)); // c1과 주소값이 같다
        System.out.println(c1 == c2); // true


        // Company c1 = new Company(); // private Company, 때문에 생성불가
        // Company c2 = new Company();
        // System.out.println("c1 = " + System.identityHashCode(c1));
        // System.out.println("c2 = " + System.identityHashCode(c2)); // c1과 주소값이 다르다
    }
}
