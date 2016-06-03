package toporynskyi.goit.module03.flowers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by grant on 5/31/16.
 */
public class RoseBush extends Rose {

    List<Rose> rosesList = new ArrayList<>();

    public RoseBush(int amountOfRoses){
        super("Amazone", "Rose", "Yellow");

        for (int i = 0; i < amountOfRoses; i++) {
            Rose rose = new Rose("Amazone", "Rose", "Yellow");
            this.rosesList.add(rose);
        }
    }


    @Override
    public String getCurrentName() {

        if (rosesList.size() > 1) {
            return this.currentName + " : Sort, || RoseBush: " + rosesList.size() + " roses" + ", || Color: " + currentColor;
        }

        if (rosesList.size() == 1) {
            return this.currentName + " : Sort, || Rose: " + rosesList.size() + " rose" + ", || Color: " + currentColor;
        }

        return this.currentName;
    }
}