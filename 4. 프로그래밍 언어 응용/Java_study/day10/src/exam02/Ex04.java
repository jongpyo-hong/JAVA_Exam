package exam02;

import static exam02.Transportation.*;

public class Ex04 {
    public static void main(String[] args) {
        //Transportation trans1 = BUS; // public static final
        int busFare = BUS.getBasicFare();
        int subwayFare = SUBWAY.getBasicFare();
        int trainFare = TRAIN.getBasicFare();
        System.out.println("busFare = " + busFare);
        System.out.println("subwayFare = " + subwayFare);
        System.out.println("trainFare = " + trainFare);
        System.out.println(BUS.getTotalFare(5));
    }
}
