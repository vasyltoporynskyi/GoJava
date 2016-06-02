package toporynskyi.goit.module03.files;

/**
 * Created by grant on 5/31/16.
 */
public class TextFile extends File {

    private String currentName = "TextFile";


    @Override
    public String getCurrentName(){
        return this.currentName;
    }
    @Override
    public String getCurrentType() {
        return currentType;
    }

}