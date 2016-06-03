package toporynskyi.goit.module03.files;

/**
 * Created by grant on 5/31/16.
 */
public class ImageFile extends File {

    private String currentImageFormat = "jpg";

    public ImageFile(String currentName, String currentType, int currentSize) {
        super(currentName, currentType, currentSize);
    }

    @Override
    public String getCurrentName() {
        return currentName + "." + currentImageFormat + " (Type: " + currentType + ", Zise: " + currentSize + "KB)";
    }
}