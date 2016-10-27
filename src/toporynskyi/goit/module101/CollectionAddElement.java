package toporynskyi.goit.module101;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by grant on 10/24/16.
 */
public class CollectionAddElement {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        for (int n : list) {
            System.out.println(n + " ");
        }

        System.out.print("++++++++++++++++++++++" + "\n");

        list.add(5, 6);

        for (int n : list) {
            System.out.println(n + " ");
        }
        System.out.println("++++++++++++++++++++++" + "\n");

        int element = list.get(5);

        for(int i = 0; i < 5; i++){


        }

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {



        }

    }
}
