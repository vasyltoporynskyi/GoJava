package toporynskyi.goit.module08.myCollections.files;

/**
 * Created by grant on 6/18/16.
 */
public class PictureFile extends File {
    private String format;

    public PictureFile(String name, String address, int size, String format) {
        super(name, address, size);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
