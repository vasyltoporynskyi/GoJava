package toporynskyi.goit.module04.tempConverter;

/**
 * Created by grant on 6/4/16.
 */
public class TemperatureUtils {


    public static void main(String[] args) {

        double cTemp = 20;
        double fTemp;
        fTemp = cTemp * 9/5 + 32;
        cTemp = ((fTemp - 32) * 5/9);

        System.out.println("t C: " + cTemp + " = t F: " + fTemp);
        System.out.println("t F: " + fTemp + " = t C: " + cTemp);
    }
}

