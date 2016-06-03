package toporynskyi.goit.module03.instruments;

/**
 * Created by grant on 5/31/16.
 */
public abstract class MusicalInstrument {

    protected String currentName;
    protected String currentType;


    public MusicalInstrument(String currentName, String currentType) {
        this.currentName = currentName;
        this.currentType = currentType;
    }


    public String getCurrentName(){
        return this.currentName + " : Brand, || Musical Instrument: " + currentType;
    }

}