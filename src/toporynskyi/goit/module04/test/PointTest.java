package toporynskyi.goit.module04.test;

import org.junit.Assert;
import toporynskyi.goit.module04.distancePoint.Point;

/**
 * Created by grant on 7/1/16.
 */
public class PointTest {
    @org.junit.Test
    public void distance() throws Exception {
        Point pointA = new Point(1, 11);
        Point pointB = new Point(8, 3);

        final double result = pointA.distance(pointB);
        Assert.assertEquals(pointA.distance(pointB), result, 0.001);
    }
}