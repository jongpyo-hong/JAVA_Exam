package Test;

public class Ex01_tan {
    public static void main(String[] args) {
        double deg = 40;
        double dis = 200;

        double hei = 0;

        double radi = Math.toRadians(deg);

        hei = dis * (Math.tan(radi));
        System.out.println(hei);

    }
}
