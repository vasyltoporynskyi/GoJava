package toporynskyi.goit.module08.myCollections.files;

import java.util.List;

/**
 * Created by grant on 6/18/16.
 */
public class Directory {
    private List<File> files;

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void printDirContent() {
        this.files
                .stream()
                .forEach(e -> System.out.println(e.getName() + "\t" + e.getAddress() + "\t" + e.getSize()));
    }
}
