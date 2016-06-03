package toporynskyi.goit.module03.files;

import java.util.ArrayList;

/**
 * Created by grant on 5/31/16.
 */
public class Folder extends File {


    private ArrayList<File> filesList = new ArrayList<>();
    private ArrayList<Folder> foldersList = new ArrayList<>();


    public Folder(File... files){
        super("Folder", "Empty");

        for (File f : files) {
            this.filesList.add(f);
        }
    }

    public ArrayList<File> getFilesList() {
        return this.filesList;
    }

    public ArrayList<Folder> getFolderList() {
        return this.foldersList;
    }

    public void setFoldersInFolder(Folder... folders) {
        for (Folder d : folders) {
            this.foldersList.add(d);
        }
    }

    public void setFilesInFolder(File... files) {
        for (File f : files) {
            this.filesList.add(f);
        }
    }

    @Override
    public String getCurrentName() {
        return currentName + " (Into: " + currentInto + ")";
    }


    public static void main(String[] args) {

        Folder folder = new Folder(new TextFile("TaxList", "TXT", 256), new AudioFile("Thunderstruck", "MP3", 5), new ImageFile("SkyImage", "JPG", 2048));

        folder.setFilesInFolder(new AudioFile("Highway to hell", "WAV", 45), new AudioFile("Back in black", "WAV", 33), new TextFile("OrderList", "TXT", 128));
        folder.setFoldersInFolder(new Folder());

        for (File f : folder.getFilesList()){
            System.out.println(f.getCurrentName());
        }
        for (Folder d : folder.getFolderList()){
            System.out.println(d.getCurrentName());
        }

    }


}