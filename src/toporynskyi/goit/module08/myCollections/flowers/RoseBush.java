package toporynskyi.goit.module08.myCollections.flowers;

/**
 * Created by grant on 6/19/16.
 */
public class RoseBush {
    private Flower flower;
    private int amountOfFlowers;

    public RoseBush(Flower flower, int amountOfFlowers) {
        this.flower = flower;
        this.amountOfFlowers = amountOfFlowers;

    }

    public Flower getFlower() {
        return flower;
    }

    public int getAmountOfFlowers() {
        return amountOfFlowers;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public void setAmountOfFlowers(int amountOfFlowers) {
        this.amountOfFlowers = amountOfFlowers;
    }
}
