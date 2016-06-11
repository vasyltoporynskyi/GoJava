package toporynskyi.goit.module06.musicStore;

/**
 * Created by grant on 6/11/16.
 */
public class NegativeValueException extends Exception {
    private final String message;

    public NegativeValueException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
