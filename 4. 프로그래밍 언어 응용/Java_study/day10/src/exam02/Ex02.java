package exam02;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        Transportation trans = Transportation.SUBWAY;
        System.out.println(trans.getClass().getName());
        System.out.println("name() : " + trans.name());
        System.out.println("ordinal() : " + trans.ordinal()); // 0, 1, 2

        String trans2 = "BUS";
        Transportation bus = Enum.valueOf(Transportation.class, trans2);
        System.out.println(bus);

        Transportation train = Transportation.valueOf("TRAIN");

        Transportation[] trans3 = Transportation.values();
        System.out.println(Arrays.toString(trans3));
    }
}
