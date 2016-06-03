package toporynskyi.goit.module03.files;

/**
 * Created by grant on 5/31/16.
 */
public abstract class File {

    protected String currentName;
    protected String currentType;
    protected int currentSize;
    protected String currentInto;


    public File(String currentName, String currentType, int currentSize) {
        this.currentName = currentName;
        this.currentType = currentType;
        this.currentSize = currentSize;
    }

    public File(String currentName, String currentInto) {
        this.currentName = currentName;
        this.currentInto = currentInto;
    }


    public String getCurrentName() {
        return currentName;
    }

}
