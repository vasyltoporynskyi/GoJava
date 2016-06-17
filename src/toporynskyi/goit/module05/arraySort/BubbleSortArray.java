package toporynskyi.goit.module05.arraySort;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by grant on 6/7/16.
 */
public class BubbleSortArray {

    public static void bubbleSort(int[] array) {

            int min;
            int tmp;

            for (int i = 0; i < array.length; i++) {
                min = i;
                for (int j = i; j < array.length; j++) {
                    if (array[j] < array[min])
                        min = j;
                }
                tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }

    }

    public static void showResults(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "  ");

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

        System.out.print(" Random Array: \n");


        for (int i = 0; i < array.length; i++) {
            // anit-patterns "Magic number", "Hard code". Условие длены массива не должно задаваться коде.
            //Yaroslav: поскольку ето уже каое-то подобие на взаимодействие с юзером, то сдесь впринципе могу с тобой согласится
            //что ето "Hard code".
            array[i] = randomAdd.nextInt(100);
            System.out.print(array[i] + "  ");
        }


        BubbleSortArray.bubbleSort(array);
        System.out.println("\n" + " Sorted Array:");
        BubbleSortArray.showResults(array);

    }
}


