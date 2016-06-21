package toporynskyi.goit.module08.myCollections.files;

import java.util.List;

/**
 * Created by grant on 6/18/16.
 */
public class Directory extends File{
    private List<File> files;

    public Directory(String name, String address, int size) {
        super(name, address, size);
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }


}
