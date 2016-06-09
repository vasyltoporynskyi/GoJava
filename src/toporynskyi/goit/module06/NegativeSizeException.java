package toporynskyi.goit.module06;

/**
 * Created by grant on 6/9/16.
 */
public class NegativeSizeException extends RuntimeException {

    private int size;

    public NegativeSizeException(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

}
