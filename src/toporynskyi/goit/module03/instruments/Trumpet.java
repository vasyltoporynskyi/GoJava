package toporynskyi.goit.module03.instruments;

/**
 * Created by grant on 5/31/16.
 */
public class Trumpet extends MusicalInstrument{

    private String currentString = "Trumpet";

    @Override
    public String getCurrentString(){
        return this.currentString;
    }
}
