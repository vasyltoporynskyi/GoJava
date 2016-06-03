package toporynskyi.goit.module03.files;

/**
 * Created by grant on 5/31/16.
 */
public class AudioFile extends File {

    private String currentAudioFormat = "wav";


    public AudioFile(String currentName, String currentType, int currentSize) {
        super(currentName, currentType, currentSize);
    }

    @Override
    public String getCurrentName() {
        return currentName + "." + currentAudioFormat + " (Type: " + currentType + ", Zise: " + currentSize + "MB)";
    }


}