package toporynskyi.goit.module03.files;

/**
 * Created by grant on 5/31/16.
 */
public class TextFile extends File {

    protected String currentTextFormat = "txt";

    public TextFile(String currentName, String currentType, int currentSize) {
        super(currentName, currentType, currentSize);
    }


    @Override
    public String getCurrentName() {
        return currentName + "." + currentTextFormat + " (Type: " + currentType + ", Zise: " + currentSize + "KB)";
    }

}