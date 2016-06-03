package toporynskyi.goit.module04.figureArea;

/**
 * Created by grant on 6/3/16.
 */
public class CalculatesArea {

    public static void main(String[] args) {

        Figure circle = new Circle(12);
        Figure triangle = new Triangle(22, 41);
        Figure rectangle = new Rectangle(43, 53);

        circle.showResult();
        triangle.showResult();
        rectangle.showResult();
    }
}