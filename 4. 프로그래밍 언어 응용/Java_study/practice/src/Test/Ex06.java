package Test;

public class Ex06 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%j==0) {
                    count++;
                }

            }
        }
    }
}
