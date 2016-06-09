package toporynskyi.goit.module04.figureArea;

import java.util.IllegalFormatException;

/**
 * Created by grant on 6/3/16.
 */
public class Circle extends Figure {

    protected final double Pi = 3.14;
    protected double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double figureArea() throws Exception {
        try {
            if (radius <= 0) {
                throw new Exception();
            }
        } catch (IllegalFormatException e) {
            e.getCause();
        }
        return Pi * (radius * radius);
    }

    @Override
    public void showResult() throws Exception {
        System.out.println("Circle Area = " + figureArea() + " сm");
    }

}
