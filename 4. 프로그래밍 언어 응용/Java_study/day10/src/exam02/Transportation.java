package exam02;

public enum Transportation { // java.lang.Enum 상속
    BUS(1250) {
        @Override
        public int getTotalFare(int no) {
            return getBasicFare() * no;
        }
    }, // private final Transportation BUS = new Transportation(1350)
    SUBWAY(1350) {
        public int getTotalFare(int no) {
            return getBasicFare() * no;
        }
    },
    TRAIN(5000) {
        public int getTotalFare(int no) {
            return getBasicFare() * no;
        }
    }; // 상수 나열, Transportation의 각 정적 객체
    // public static final BUS = new Transportation();
    // public static final SUBWAY = new Transportation();
    // public static final TRAIN = new Transportation();
    // String name() - BUS, SUBWAY, TRAIN
    // String ordinal() - 0, 1, 2

    private final int basicFare; // 멤버 추가

    Transportation(int basicFare) {
        this.basicFare = basicFare;
    }

    public int getBasicFare() {
        return basicFare;
    }

    public abstract int getTotalFare(int no); // 추상메서드를 사용할 수 있다
}
