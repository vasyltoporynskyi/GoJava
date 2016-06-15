package toporynskyi.goit.module04.distancePoint;

/**
 * Created by grant on 6/4/16.
 */
public class Point {

    public static void main (String[] args) {



        // anit-patterns "Magic number", "Hard code". Значени точек не должно задаваться коде. Необходимо вывести в отдельный метод.
        Point pointA = new Point(-14, 20);
        Point pointB = new Point(8, 12);

        System.out.println("Point from point A to point B = " + pointA.distance(pointB));
    }

    double x, y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point pointTo){
        return Math.sqrt(Math.pow(x - pointTo.x, 2) + Math.pow(y - pointTo.y, 2));
    }

}
