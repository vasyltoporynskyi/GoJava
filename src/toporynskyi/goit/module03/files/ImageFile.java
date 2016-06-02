package toporynskyi.goit.module03.files;

/**
 * Created by grant on 5/31/16.
 */
public class ImageFile extends File {

    private String currentName = "ImageFile";


    @Override
    public String getCurrentName(){
        return this.currentName;
    }
    @Override
    public String getCurrentType() {
        return currentType;
    }
}