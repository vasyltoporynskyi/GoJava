package toporynskyi.goit.module05.arraySort;

import java.util.Random;

/**
 * Created by grant on 6/7/16.
 */
public class BubbleSortArray {

    public static void main(String[] args) {


        int [] array = new int[20];
        Random randomAdd = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = randomAdd.nextInt(100);
          System.out.print(array[i] + " | ");
        }

        System.out.print("\n");

        int min = 0;
        int tmp;

        for(int i=0; i<array.length; i++)
        {
            min = i;
            for(int j=i; j< array.length; j++)
            {
                if(array[j] < array[min])
                    min = j;

            }
            tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
            System.out.print(array[i] + " | ");
        }




    }
}