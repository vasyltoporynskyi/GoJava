package toporynskyi.goit.module06.musicStore;

/**
 * Created by grant on 5/31/16.
 */
public class MusicInstrument {


    public static final String GUITARS = "Guitars";
    public static final String TRUMPETS = "Trumpets";
    public static final String PIANOS = "Pianos";

    protected String currentName;
    protected String currentType;


    public MusicInstrument(String currentName, String currentType) {
        this.currentName = currentName;
        this.currentType = currentType;
    }


    public String getCurrentName(){
        return this.currentName + " : Brand, || Musical Instrument: " + currentType;
    }

}