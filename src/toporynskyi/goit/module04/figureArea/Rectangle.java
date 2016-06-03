package toporynskyi.goit.module04.figureArea;

/**
 * Created by grant on 6/3/16.
 */
public class Rectangle extends Figure {

    protected double a;
    protected double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double figureArea() {
        return a * b;
    }

    @Override
    public void showResult() {
        System.out.println("Rectangle Area = " + figureArea() + " сm");
    }

}
