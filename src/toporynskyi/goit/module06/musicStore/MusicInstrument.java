package toporynskyi.goit.module06.musicStore;

/**
 * Created by grant on 5/31/16.
 */
public class MusicInstrument {


    public static final String GUITARS = "Guitars";
    public static final String TRUMPETS = "Trumpets";
    public static final String PIANOS = "Pianos";

    protected String currentName;
    protected String currentType;

// anit-pattern "Boat anchor" не используемые переменные в класе.
// Необходимо добавить в конструктор суперкласса "currentName" и "currentType".
// Наследовать их в данном классе, а так же использовать в для определения названия и типа инструмента.
    public MusicInstrument() {
    }


    public String getCurrentName(){
        return this.currentName + " : Brand, || Musical Instrument: " + currentType;
    }

}