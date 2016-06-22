package toporynskyi.goit.module07.musicStoreRef;

/**
 * Created by grant on 6/15/16.
 */
public abstract class MusicInstrument {

    private String name;
    private InstrumentType typeInstrument;


    public String getName() {
        return name;
    }

    public InstrumentType getTypeInstrument() {
        return typeInstrument;
    }

    public MusicInstrument() {
    }


    public String getType() {

        switch (typeInstrument){
            case GUITARS:
                return "guitar";
            case PIANOS:
                return "piano";
            case TRUMPETS:
                return "trumpet";
        }
     // return this.getClass().getSimpleName().toLowerCase();
        return String.valueOf(typeInstrument);
    }

    @Override
    public abstract String toString();
}

