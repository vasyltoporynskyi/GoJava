package toporynskyi.goit.module03.files;

import java.util.ArrayList;

/**
 * Created by grant on 5/31/16.
 */
public class Folder extends File {


    private String currentName = "Folder";
    private ArrayList<File> filesList = new ArrayList<>();


    public Folder(File... files){

        for (File f : files) {
            this.filesList.add(f);
        }
    }

    public ArrayList<File> getFilesList() {
        return this.filesList;
    }

    public void setFilesInFolder(File... files){
        for (File f : files) {
            this.filesList.add(f);
        }
    }



    @Override
    public String getCurrentName() {
        return currentName;
    }

    public static void main(String[] args) {

        Folder folder = new Folder(new TextFile(), new AudioFile(), new ImageFile(), new Folder());

        folder.setFilesInFolder(new AudioFile(), new AudioFile(), new TextFile(), new Folder());

        for (File f : folder.getFilesList()){
            System.out.println(f.getCurrentName());
        }
    }

}