package toporynskyi.goit.module07.musicStoreRef;

/**
 * Created by grant on 6/15/16.
 */
class WrongInstrumentException extends Exception {
    public WrongInstrumentException(String message) {
        super("The instrument [" + message + "] is not allowed in store.");
    }
}