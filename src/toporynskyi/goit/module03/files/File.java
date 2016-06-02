package toporynskyi.goit.module03.files;

/**
 * Created by grant on 5/31/16.
 */
public abstract class File {

    protected String currentName = "Name";
    protected String currentType = "Type";



    public String getCurrentName() {
        return currentName;
    }

    public String getCurrentType(){
        return currentType;
    }

}
