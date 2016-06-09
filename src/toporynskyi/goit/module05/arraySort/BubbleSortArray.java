package toporynskyi.goit.module05.arraySort;

import toporynskyi.goit.module06.taskExceptions.NegativeElementException;

import java.util.Random;

/**
 * Created by grant on 6/7/16.
 */
public class BubbleSortArray {

    public static void bubbleSort(int[] array) {

        try {

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

            if (array.length < 2) {
                throw new NegativeElementException(array.length);
            }
        } catch (NegativeElementException e) {
            e.printStackTrace();
            System.out.print("\n Error, wrong number of elements!" + " You have only: " + e.getElemet());
            System.out.println("\n");
        }
    }

    public static void showResults(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "  ");

    }


    public static void main(String[] args) {

        int[] array = new int[20];
        Random randomAdd = new Random();
        System.out.print(" Random Array: \n");
        for (int i = 0; i < array.length; i++) {
            array[i] = randomAdd.nextInt(100);
            System.out.print(array[i] + "  ");
        }



            BubbleSortArray.bubbleSort(array);
            System.out.println("\n" + " Sorted Array:");
            BubbleSortArray.showResults(array);

    }
}


