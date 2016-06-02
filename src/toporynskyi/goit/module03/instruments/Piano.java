package toporynskyi.goit.module03.instruments;

/**
 * Created by grant on 5/31/16.
 */
public class Piano extends MusicalInstrument {

    private String currentString = "Piano";

    @Override
    public String getCurrentString(){
        return this.currentString;
    }

}
