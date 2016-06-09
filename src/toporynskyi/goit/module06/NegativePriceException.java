package toporynskyi.goit.module06;

/**
 * Created by grant on 6/9/16.
 */
public class NegativePriceException extends RuntimeException{

    private int price;

    public NegativePriceException(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
