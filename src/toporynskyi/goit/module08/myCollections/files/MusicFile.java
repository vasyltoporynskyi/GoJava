package toporynskyi.goit.module08.myCollections.files;

/**
 * Created by grant on 6/18/16.
 */
public class MusicFile extends File {
    private String author;
    private int duration;

    public MusicFile(String name, String address, int size, String author, int duration) {
        super(name, address, size);
        this.author = author;
        this.duration = duration;
    }

    public String getAuthor() {
        return author;
    }

    public int getDuration() {
        return duration;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
