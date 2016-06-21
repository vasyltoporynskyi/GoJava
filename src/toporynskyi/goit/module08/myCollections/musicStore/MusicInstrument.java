package toporynskyi.goit.module08.myCollections.musicStore;

/**
 * Created by grant on 6/20/16.
 */
public class MusicInstrument {
    protected String name;
    protected int cost;
    protected String manufacturer;

    public MusicInstrument(String name, int cost, String manufacturer) {
        this.name = name;
        this.cost = cost;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
