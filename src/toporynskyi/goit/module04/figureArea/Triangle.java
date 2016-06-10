package toporynskyi.goit.module04.figureArea;


/**
 * Created by grant on 6/3/16.
 */
public class Triangle extends Figure {

    protected double sideA;
    protected double sideB;

    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double figureArea() {
        return sideA * sideB / 2;
    }

    @Override
    public void showResult() {
        System.out.println("Triangle Area = " + figureArea() + " сm");
    }

}