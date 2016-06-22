package toporynskyi.goit.module09;

import toporynskyi.goit.module08.myCollections.files.*;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by grant on 6/22/16.
 */
public class CollectionFilesEncode  implements Comparator<File> {

    @Override
    public int compare(File o1, File o2) {
        String fileOne = o1.getName();
        String fileTwo = o2.getName();

        return fileOne.compareTo(fileTwo);
    }

    public static void main(String[] args) {

        TreeSet<File> filesTreeSort = new TreeSet<>(new CollectionFilesEncode());

        MusicFile imagine = new MusicFile("Imagine World without War ", "file", 10);
        PictureFile picture = new PictureFile("Wallpaper of Beautiful nature ", "file", 2);
        TextFile text = new TextFile("Azure Active Directory ", "file", 7);
        Directory directory = new Directory("Regulations documents folder", "folder", 1);

        filesTreeSort.add(imagine);
        filesTreeSort.add(picture);
        filesTreeSort.add(text);
        filesTreeSort.add(directory);

        FileEncryption.encode(imagine);
        FileEncryption.encode(picture);
        FileEncryption.encode(text);
        FileEncryption.encode(directory);

        System.out.println(" File after encoding: \n");

        for (File e : filesTreeSort) {
            System.out.println(e.getName() + "\t" + e.getAddress() + "\t" + e.getSize());

        }

        FileEncryption.decode(imagine);
        FileEncryption.decode(picture);
        FileEncryption.decode(text);
        FileEncryption.decode(directory);

        System.out.println("\n Files after decoding: \n");

        for (File e : filesTreeSort) {
            System.out.println(e.getName() + "\t" + e.getAddress() + "\t" + e.getSize());

        }




    }
}
