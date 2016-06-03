package toporynskyi.goit.module04.figureArea;

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
    public double figureArea() {
        return Pi * ( radius * radius);
    }

    @Override
    public void showResult() {
        System.out.println("Circle Area = " + figureArea() + " сm");
    }

}
