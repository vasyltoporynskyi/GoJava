package toporynskyi.goit.module03.files;

/**
 * Created by grant on 5/31/16.
 */
public abstract class File {

    protected String currentName;
    protected String currentType;
    protected int currentSize;


    public File(String currentName, String currentType, int currentSize) {
        this.currentName = currentName;
        this.currentType = currentType;
        this.currentSize = currentSize;
    }

    public File(String currentName) {
        this.currentName = currentName;
    }


    public String getCurrentName() {
        return currentName;
    }

}
