package toporynskyi.goit.module04.figureArea;

import java.util.IllegalFormatException;

/**
 * Created by grant on 6/3/16.
 */
public class Rectangle extends Figure {

    protected double sideA;
    protected double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public double figureArea() throws Exception{
        try {
            if (sideA <= 0 || sideB <=0) {
                throw new Exception();
            }
        } catch (IllegalFormatException e) {
            e.getCause();
        }
        return sideA * sideB;
    }

    @Override
    public void showResult() throws Exception {
        System.out.println("Rectangle Area = " + figureArea() + " сm");
    }

}
