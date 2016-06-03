package toporynskyi.goit.module03.instruments;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by grant on 5/31/16.
 */
public class MusicShop {

    private List<MusicalInstrument> instrumentsList = new ArrayList<>();

    public MusicShop(MusicalInstrument... instruments){

        for (MusicalInstrument m : instruments) {
            this.instrumentsList.add(m);
        }
    }

    public List<MusicalInstrument> getInstrumentsList() {
        return this.instrumentsList;
    }

    public void setInstrumentsInShop(MusicalInstrument... instruments){
        for (MusicalInstrument m : instruments) {
            this.instrumentsList.add(m);
        }
    }

    public static void main(String[] args) {

        MusicShop musicShop = new MusicShop(new Guitar("Trymbita", "Guitar"), new Piano("Baldwin", "Piano"), new Trumpet("Goldens", "Trumpet"));

        musicShop.setInstrumentsInShop(new Piano("Baldwin", "Piano"), new Guitar("Trymbita", "Guitar"));

        for (MusicalInstrument m : musicShop.getInstrumentsList()){
            System.out.println(m.getCurrentName());
        }
    }
}