package toporynskyi.goit.module03.files;

/**
 * Created by grant on 5/31/16.
 */
public class ImageFile extends File {

    protected String currentImageFormat = "jpg";

    public ImageFile(String currentName, String currentType, int currentSize) {
        super(currentName, currentType);
        this.currentSize = currentSize;
    }

    @Override
    public String getCurrentName() {
        return currentName + "." + currentImageFormat + " (MusicInstrumentType: " + currentType + ", Zise: " + currentSize + "KB)";
    }
}