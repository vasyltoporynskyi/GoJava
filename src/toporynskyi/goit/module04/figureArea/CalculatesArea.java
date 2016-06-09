package toporynskyi.goit.module04.figureArea;


/**
 * Created by grant on 6/3/16.
 */
public class CalculatesArea {

    public static void main(String[] args) throws Exception {

        Figure circle = new Circle(12);
        Figure triangle = new Triangle(12, 10);
        Figure rectangle = new Rectangle(45, 10);


        circle.showResult();
        triangle.showResult();
        rectangle.showResult();
    }
}