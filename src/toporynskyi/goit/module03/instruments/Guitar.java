package toporynskyi.goit.module03.instruments;

/**
 * Created by grant on 5/31/16.
 */
public class Guitar extends MusicalInstrument {

    private String currentString = "Guitar";

    @Override
    public String getCurrentString(){
        return this.currentString;
    }

}