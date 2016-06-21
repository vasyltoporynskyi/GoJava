package toporynskyi.goit.module08.myCollections.flowers;

/**
 * Created by grant on 6/19/16.
 */
public class Flower {
    protected String name;
    protected int size;

    public Flower(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
