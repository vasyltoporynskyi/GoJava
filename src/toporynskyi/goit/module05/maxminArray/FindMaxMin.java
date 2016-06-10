package toporynskyi.goit.module05.maxminArray;

import java.util.Random;
import java.util.Scanner;


/**
 * Created by grant on 6/6/16.
 */
public class FindMaxMin {

    public static int findMaxElement(int[] array) {

        int maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i])
                maxElement = array[i];
        }
        return maxElement;
    }

    public static int findMinElement(int[] array){

        int minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minElement > array[i])
                minElement = array[i];
        }
        return minElement;
    }


    public static void main(String[] args) {

        System.out.println("Enter Array length: ");
        final Scanner scanner = new Scanner(System.in);
        final String userInput = String.valueOf(scanner.next());

        int arrayLength;
        try {

            arrayLength = Integer.parseInt(String.valueOf(userInput));
        } catch (NumberFormatException ex) {
            System.out.print("Error Value! \n" + "Enter Integer Value: \n");
            String userInput2 = String.valueOf(scanner.next());
            arrayLength = Integer.parseInt(String.valueOf(userInput2));

        }


        int[] array = new int[arrayLength];
        Random randomAdd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = randomAdd.nextInt(100);
            System.out.print(array[i] + "  ");
        }
                System.out.println("\n");
                System.out.println("Min = " + FindMaxMin.findMinElement(array) + "\n");
                System.out.println("Max = " + FindMaxMin.findMaxElement(array) + "\n");
        }
}






