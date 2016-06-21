package toporynskyi.goit.module08.myCollections.musicStore;

import java.util.List;

/**
 * Created by grant on 6/20/16.
 */
public class MusicStore {
    private List<MusicInstrument> musicInstruments;

    public void setMusicInstruments(List<MusicInstrument> musicInstruments) {
        this.musicInstruments = musicInstruments;
    }
    public void printMusicStore() {
        this.musicInstruments
                .stream()
                .forEach(e -> System.out.println(e.getName() + "\t" + e.getManufacturer() + "\t" + e.getCost()));
    }
}
