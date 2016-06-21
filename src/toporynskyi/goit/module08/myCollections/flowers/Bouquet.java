package toporynskyi.goit.module08.myCollections.flowers;

import java.util.List;

/**
 * Created by grant on 6/19/16.
 */
public class Bouquet {
    private List<Flower> flowers;

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFiles(List<Flower> files) {
        this.flowers = files;
    }

    public void printBouquet() {
        this.flowers
                .stream()
                .forEach(e -> System.out.println(e.getName() + "\t" + e.getSize()));
    }
}
