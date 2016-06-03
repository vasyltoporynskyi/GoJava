package toporynskyi.goit.module04.figureArea;

/**
 * Created by grant on 6/3/16.
 */
public class Circle extends Figure {

    protected final double pi = 3.14;
    protected double r;

    public Circle (double r){
        this.r = r;
    }

    @Override
    public double figureArea() {
        return pi * ( r * r);
    }

    @Override
    public void showResult() {
        System.out.println("Circle Area = " + figureArea() + " сm");
    }

}
