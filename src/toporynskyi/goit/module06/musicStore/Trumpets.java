package toporynskyi.goit.module06.musicStore;

/**
 * Created by grant on 5/31/16.
 */
// anit-pattern "Boat anchor" не используемый класс.
// Необходимо добавить в конструктор суперкласса "currentName" и "currentType".
// Наследовать их в данном классе, а так же использовать в для определения названия и типа инструмента.
public class Trumpets extends MusicInstrument{

    public Trumpets() {
        super();
    }
}