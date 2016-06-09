package toporynskyi.goit.module06.taskExceptions;

/**
 * Created by grant on 6/9/16.
 */
public class NegativeElementException extends Exception{

    private int element;

    public NegativeElementException(int element) {
        this.element = element;
    }

    public int getElemet() {
        return element;
    }

}
