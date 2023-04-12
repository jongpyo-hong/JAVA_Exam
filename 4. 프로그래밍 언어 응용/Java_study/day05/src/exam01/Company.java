package exam01;

public class Company {
    // private static Company instance = new Company(); // 메모리의 낭비

    private Company() {}
    private static Company instance; // 호출할 때만 변수 생성
    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }

        return instance; // 싱글톤 패턴
    }
}
