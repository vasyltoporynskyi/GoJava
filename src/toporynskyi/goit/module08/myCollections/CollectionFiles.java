package toporynskyi.goit.module08.myCollections;

import toporynskyi.goit.module08.myCollections.files.*;

import java.util.*;

/**
 * Created by grant on 6/18/16.
 */
public class CollectionFiles implements Comparator<File> {

    @Override
    public int compare(File o1, File o2) {
        String fileOne = o1.getName();
        String fileTwo = o2.getName();

        return fileOne.compareTo(fileTwo);
    }

    public static void main(String[] args) {

        TreeSet<File> filesTreeSort = new TreeSet<>(new CollectionFiles());
        filesTreeSort.add(new MusicFile("Imagine", "file", 10));
        filesTreeSort.add(new MusicFile("Smoke on the water", "file", 15));
        filesTreeSort.add(new PictureFile("Wallpaper", "file", 2));
        filesTreeSort.add(new PictureFile("Photo Home", "file", 22));
        filesTreeSort.add(new TextFile("DocFile", "file", 7));
        filesTreeSort.add(new Directory("Folder", "folder", 1));


        for (File e : filesTreeSort) {
            System.out.println(e.getName() + "\t" + e.getAddress() + "\t" + e.getSize());

        }

    }
}
