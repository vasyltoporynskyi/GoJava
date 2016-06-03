package toporynskyi.goit.module03.flowers;

/**
 * Created by grant on 5/31/16.
 */
public abstract class Flower {

    protected String currentName;
    protected String currentType;
    protected String currentColor;


    public Flower(String currentName, String currentType, String currentColor) {
        this.currentName = currentName;
        this.currentType = currentType;
        this.currentColor = currentColor;
    }


    public String getCurrentName(){
        return this.currentName + " : Sort, || Flower: " + currentType + ", || Color: " + currentColor;
    }
}