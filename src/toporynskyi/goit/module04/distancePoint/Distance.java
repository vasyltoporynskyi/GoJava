package toporynskyi.goit.module04.distancePoint;

/**
 * Created by grant on 6/4/16.
 */
public class Distance {

    public static void main (String... args) {

        Distance pointA = new Distance(-14, 20);
        Distance pointB = new Distance(8, 12);

        System.out.println("Distance from point A to point B = " + pointA.distance(pointB));
    }

    double x, y;

    public Distance(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Distance pointTo){
        return Math.sqrt(Math.pow(x - pointTo.x, 2) + Math.pow(y - pointTo.y, 2));
    }

}
