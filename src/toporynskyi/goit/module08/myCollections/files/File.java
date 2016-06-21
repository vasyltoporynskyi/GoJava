package toporynskyi.goit.module08.myCollections.files;

/**
 * Created by grant on 6/18/16.
 */
public abstract class File {
    protected String name;
    protected String address;
    protected int size;

    public File(String name, String address, int size) {
        this.name = name;
        this.address = address;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }
}
