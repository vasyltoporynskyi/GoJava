package toporynskyi.goit.module03.flowers;

import java.util.ArrayList;

/**
 * Created by grant on 5/31/16.
 */
public class BouquetFlowers {

    private ArrayList<Flower> flowersList = new ArrayList<>();

    public BouquetFlowers(Flower... flowers){

        for (Flower f : flowers) {
            this.flowersList.add(f);
        }
    }

    public ArrayList<Flower> getFlowersList() {
        return this.flowersList;
    }

    public void setFlowersInBouquet(Flower... flowers){
        for (Flower f : flowers) {
            this.flowersList.add(f);
        }
    }

    public static void main(String[] args) {

        BouquetFlowers bouquet = new BouquetFlowers(new Rose(), new Chamomile(), new Aster());

        bouquet.setFlowersInBouquet(new Tulip(), new RoseBush(7));

        for (Flower f : bouquet.getFlowersList()){
            System.out.println(f.getCurrentString());
        }
    }

}