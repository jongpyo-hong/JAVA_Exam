package exam08;

public class Outer {

    public Calculator method(int num3) {

        return new Calculator() {
          public int add(int num1, int num2) {
              // num3 -> 상수화 -> final int num3

              return num1 + num2 + num3;
          }
        };

    }
}
