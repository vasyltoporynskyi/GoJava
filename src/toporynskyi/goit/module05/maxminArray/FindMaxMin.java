package toporynskyi.goit.module05.maxminArray;

import toporynskyi.goit.module06.taskExceptions.NegativeElementException;

import java.util.Random;

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

        int[] array = new int[1];
        Random randomAdd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = randomAdd.nextInt(100);
            System.out.print(array[i] + " | ");
        }

        try {
            System.out.println("\n");
            System.out.println("Min = " + FindMaxMin.findMinElement(array) + "\n");
            System.out.println("Max = " + FindMaxMin.findMaxElement(array) + "\n");
            if (array.length < 2) {
                throw new NegativeElementException(array.length);
            }
        } catch (NegativeElementException e) {
            e.printStackTrace();
            System.out.print("\n Error, wrong number of elements!" + " You have only: " + e.getElemet());
        }

    }



}
