package ex;

public class gugu {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++) {
            System.out.println("==============" + i + "단==============");
            for(int j = 1; j < 10; j++) {
                if(j>=i) {
                    System.out.println(i + "X" + j + "=" + (i*j));
                }
            }
        }
    }
}
