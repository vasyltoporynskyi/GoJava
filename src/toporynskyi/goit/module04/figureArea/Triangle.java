package toporynskyi.goit.module04.figureArea;

/**
 * Created by grant on 6/3/16.
 */
public class Triangle extends Figure {

    protected double a;
    protected double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double figureArea() {
        return a * b / 2;
    }

    @Override
    public void showResult() {
        System.out.println("Triangle Area = " + figureArea() + " сm");
    }

}