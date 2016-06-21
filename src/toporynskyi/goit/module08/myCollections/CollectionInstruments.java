package toporynskyi.goit.module08.myCollections;

import toporynskyi.goit.module08.myCollections.musicStore.*;

import java.util.*;

/**
 * Created by grant on 6/20/16.
 */
public class CollectionInstruments {
    public static void main(String[] args) {

        MusicStore musicStore = new MusicStore();
        List<MusicInstrument> instruments = new ArrayList<>();
        instruments.add(new Piano("Baldwin", 2, "Germany"));
        instruments.add(new Guitar("Trymbita", 16, "Ukraine"));
        instruments.add(new Trumpet("Goldens", 7, "Poland"));

        musicStore.setMusicInstruments(instruments);

        musicStore.printMusicStore();
    }
}
