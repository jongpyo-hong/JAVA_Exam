package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Transportation trans = Transportation.SUBWAY;

        //System.out.println(trans == Transportation.SUBWAY);

        switch(trans) {
            case BUS : // 앞에 자료형을 쓰지 않아도 사용가능하다
                System.out.println("버스");
                break;
            case SUBWAY :
                System.out.println("지하철");
                break;
            case TRAIN :
                System.out.println("기차");
                break;
        }

    }
}
