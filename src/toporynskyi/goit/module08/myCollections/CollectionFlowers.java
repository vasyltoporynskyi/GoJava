package toporynskyi.goit.module08.myCollections;

import toporynskyi.goit.module08.myCollections.flowers.*;

import java.util.*;

/**
 * Created by grant on 6/20/16.
 */
public class CollectionFlowers {

    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet();
        List<Flower> bouquetFlowers = new ArrayList<>();
        bouquetFlowers.add(new Rose("Rose", 12));
        bouquetFlowers.add(new Tulip("Tulip", 5));
        bouquetFlowers.add(new Chamomile("Chamomile", 6));
        bouquetFlowers.add(new Aster("Aster", 8));

        bouquet.setFiles(bouquetFlowers);

        bouquet.printBouquet();
    }
}