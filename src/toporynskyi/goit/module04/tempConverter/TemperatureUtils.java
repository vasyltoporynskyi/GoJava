package toporynskyi.goit.module04.tempConverter;

import java.util.Scanner;

/**
 * Created by grant on 6/4/16.
 */
public class TemperatureUtils {


    public static void main(String[] args) {


        System.out.println("Enter celsius temperature: ");
        final Scanner scanner = new Scanner(System.in);
        final String userInput = String.valueOf(scanner.next());

        double cTemp;
        double fTemp;
        try {

            cTemp = Double.parseDouble(String.valueOf(userInput));
        } catch (NumberFormatException ex) {
            System.out.print("Error Value! \n" + "Enter Double Value: \n");
            String userInput2 = String.valueOf(scanner.next());
            cTemp = Double.parseDouble(String.valueOf(userInput2));
        }


        fTemp = cTemp * 9/5 + 32;
        cTemp = ((fTemp - 32) * 5/9);

        System.out.println("t C: " + cTemp + " = t F: " + fTemp);
        System.out.println("t F: " + fTemp + " = t C: " + cTemp);
    }
}

