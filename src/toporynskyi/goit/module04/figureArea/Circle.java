package toporynskyi.goit.module04.figureArea;


/**
 * Created by grant on 6/3/16.
 */
public class Circle extends Figure {

    // anit-patterns "Magic number", "Hard code". Значени PI не является точным, и константой. Необходимо PI сделать константой с коректным значением PI.
    protected final double Pi = 3.14;
    protected double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double figureArea() {
        return Pi * (radius * radius);
    }

    @Override
    public void showResult() {
        System.out.println("Circle Area = " + figureArea() + " сm");
    }

}
