package toporynskyi.goit.module03.files;

/**
 * Created by grant on 5/31/16.
 */
public class AudioFile extends File {

    private String currentName = "AudioFile";
    private String currentFormat = "Format";
    private String currentType = "Type";


    @Override
    public String getCurrentName() {
        return currentName;
    }
    @Override
    public String getCurrentType() {
        return currentType;
    }

    public String getCurrentFormat() {
        return currentFormat;
    }
}
