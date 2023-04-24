public class tan {
    public static void main(String[] args) {
        double deg = 60;
        double dis = 20;
        double hei = 0;

        double radi = Math.toRadians(deg);

        hei = dis * (Math.tan(radi));
        System.out.println(hei);

    }
}
