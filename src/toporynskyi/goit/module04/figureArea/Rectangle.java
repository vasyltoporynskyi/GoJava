package toporynskyi.goit.module04.figureArea;


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
    public double figureArea() {
        return sideA * sideB;
    }

    @Override
    public void showResult() {
        System.out.println("Rectangle Area = " + figureArea() + " сm");
    }

}
