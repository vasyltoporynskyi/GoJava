package toporynskyi.goit.module05.maxminArray;

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

        int[] array = new int[20];
        Random randomAdd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = randomAdd.nextInt(100);
            System.out.print(array[i] + " | ");
        }
        System.out.println("\n");
        System.out.println("Min = " + FindMaxMin.findMinElement(array) + "\n");
        System.out.println("Max = " + FindMaxMin.findMaxElement(array) + "\n");

    }



}
