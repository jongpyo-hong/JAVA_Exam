package exam03;

public class Order implements Sell, Buy {
    @Override
    public void buy() {
        System.out.println("구매");
    }

    @Override
    public void sell() {
        System.out.println("판매");
    }

    @Override
    public void order() {
        Sell.super.order();
        //System.out.println("주문");
    }


}
