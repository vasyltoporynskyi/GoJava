package toporynskyi.goit.module03.flowers;

import java.util.ArrayList;

/**
 * Created by grant on 5/31/16.
 */
public class RoseBush extends Rose {

    private String currentString = "Rosebush";

    ArrayList<Rose> rosesList = new ArrayList<>();

    public RoseBush(int amountOfRoses){

        for (int i = 0; i < amountOfRoses; i++) {
            Rose rose = new Rose();
            this.rosesList.add(rose);
        }
    }

    public ArrayList<Rose> getRosesList() {

        return this.rosesList;
    }

    public void setRosesToBush(int amountOfRoses) {

        for (int i = 0; i < amountOfRoses; i++) {
            Rose rose = new Rose();
            this.rosesList.add(rose);
        }
    }

    @Override
    public String getCurrentString() {

        if (rosesList.size() > 1) {
            return this.currentString + ": " + rosesList.size() + " roses";
        }

        if (rosesList.size() == 1) {
            return this.currentString + ": " + rosesList.size() + " rose";
        }

        return this.currentString;
    }
}