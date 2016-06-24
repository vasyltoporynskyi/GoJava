package toporynskyi.goit.module09;

import toporynskyi.goit.module08.myCollections.files.*;

import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by grant on 6/22/16.
 */
public class CollectionFilesEncode implements Comparator<File> {

    @Override
    public int compare(File o1, File o2) {
        String fileOne = o1.getName();
        String fileTwo = o2.getName();

        return fileOne.compareTo(fileTwo);
    }

    public static void main(String[] args) throws IOException {

        TreeSet<File> filesTreeSort = new TreeSet<>(new CollectionFilesEncode());

        filesTreeSort.add(new MusicFile("Imagine World without War ", "file", 10));
        filesTreeSort.add(new PictureFile("Wallpaper of Beautiful nature ", "file", 2));
        filesTreeSort.add(new TextFile("Azure Active Directory ", "file", 7));
        filesTreeSort.add(new Directory("Regulations documents folder", "folder", 1));

        System.out.println(" File after encoding: \n");
        for (File e : filesTreeSort) {
            String newText = String.valueOf(e.getName());
            String encodedText = TextEncryption.encode(newText);
            e.setName(encodedText);
            System.out.println(e.getName() + "  " + e.getAddress() + "  " + e.getSize());
        }

        System.out.println(" File after decoding: \n");
        for (File e : filesTreeSort) {
            String encodedText = String.valueOf(e.getName());
            String decodedText = TextEncryption.decode(encodedText);
            e.setName(decodedText);
            System.out.println(e.getName() + "  " + e.getAddress() + "  " + e.getSize());
        }
        System.out.println("\n");
    }
}
