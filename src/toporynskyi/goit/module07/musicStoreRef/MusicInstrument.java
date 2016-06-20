package toporynskyi.goit.module07.musicStoreRef;

/**
 * Created by grant on 6/15/16.
 */
public class MusicInstrument {

    public MusicInstrument() {
    }

    public String getType() {
        return this.getClass().getSimpleName().toLowerCase();
    }

    @Override
    public String toString() {
        return getType();
    }
}
