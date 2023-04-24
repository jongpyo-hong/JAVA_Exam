package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class sosu {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i<= 1000; i++) {
            for (int j = 1; j <= i; j++){
                if(i%j==0) {
                    count++;
                }
            }
            if(count==2) {
                System.out.println(i + "는 소수 입니다");
            }
            count=0;
        }

    }

}
