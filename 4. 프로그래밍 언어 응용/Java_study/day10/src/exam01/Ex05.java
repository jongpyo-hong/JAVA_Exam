package exam01;

import java.util.StringTokenizer;

public class Ex05 {
    public static void main(String[] args) {
        String fruits = "Apple,Mango#Banana|Melon";
        StringTokenizer st = new StringTokenizer(fruits, ",#|");

        while(st.hasMoreTokens()) {
            String fruit = st.nextToken();
            System.out.println(fruit);
        }
    }
}
