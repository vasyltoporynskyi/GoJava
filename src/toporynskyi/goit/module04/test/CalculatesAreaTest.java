package toporynskyi.goit.module04.test;

import org.junit.*;
import toporynskyi.goit.module04.figureArea.*;
import static org.junit.Assert.*;

/**
 * Created by grant on 7/5/16.
 */
public class CalculatesAreaTest {

    private static Figure circle;
    private static Figure triangle;
    private static Figure rectangle;

    @BeforeClass
    public static void setValue() throws Exception {
        circle = new Circle(5);
        triangle = new Triangle(13, 22);
        rectangle = new Rectangle(24, 12);
    }

    @Test(timeout = 1000)
    public void testAreaCircle() throws Exception {
        final double area = circle.figureArea();
        assertEquals(area, circle.figureArea(), 0);
    }

    @Test(timeout = 1000)
    public void testAreaTriangle() throws Exception {
        final double area = triangle.figureArea();
        assertEquals(area, triangle.figureArea(), 0);
    }

    @Test(timeout = 1000)
    public void testAreaRectangle() throws Exception {
        final double area = rectangle.figureArea();
        assertEquals(area, rectangle.figureArea(), 0);
    }
}