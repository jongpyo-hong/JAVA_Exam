package exam03;

public interface Sell {
    void sell(); // public abstract void sell();

   default void order() {
       System.out.println("Sell - 주문");
   };
}
