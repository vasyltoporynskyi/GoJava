package toporynskyi.goit.module06.musicStore;


import java.util.*;


/**
 * Created by grant on 5/31/16.
 */
public class MusicStore {

    private int orderInstrumentCount = 0;
    Map<String, Integer> instrumentsInStore = new HashMap<>();

    public MusicStore(int guitarCountInStore, int pianoCountInStore, int trumpetCountInStore) {
        instrumentsInStore.put(MusicInstrument.GUITARS, guitarCountInStore);
        instrumentsInStore.put(MusicInstrument.PIANOS, pianoCountInStore);
        instrumentsInStore.put(MusicInstrument.TRUMPETS, trumpetCountInStore);
    }

    public void updateCount(String product) throws NegativeValueException {

        int currInstrumentCountInStore = instrumentsInStore.get(product);
        int instrumentCountLeftInStore = currInstrumentCountInStore - orderInstrumentCount;

        if (currInstrumentCountInStore < orderInstrumentCount) {
            try {

                throw new NegativeValueException("Error!");
            }catch (NegativeValueException e){
                System.out.println(" Error! No enough music instruments in Store!");
            }
        } else {
            instrumentsInStore.put(product, instrumentCountLeftInStore);
        }

    }

    public List<MusicInstrument> prepareInstruments(Map<String, Integer> order) throws NegativeValueException {
        List<MusicInstrument> output = new ArrayList<>();

        Set<String> instruments = order.keySet();
        Iterator<String> iterator = instruments.iterator();

        while (iterator.hasNext()) {

            switch (iterator.next()) {
                case MusicInstrument.GUITARS:
                    orderInstrumentCount = order.get(MusicInstrument.GUITARS);
                    updateCount(MusicInstrument.GUITARS);
                    for (int i = 0; i < orderInstrumentCount; i++) {
                        output.add(new Guitars("Trymbita", "Guitars"));
                    }
                    iterator.remove();
                    break;

                case MusicInstrument.PIANOS:
                    orderInstrumentCount = order.get(MusicInstrument.PIANOS);
                    updateCount(MusicInstrument.PIANOS);
                    for (int i = 0; i < orderInstrumentCount; i++) {
                        output.add(new Pianos("Baldwin", "Pianos"));
                    }
                    iterator.remove();
                    break;

                case MusicInstrument.TRUMPETS:
                    orderInstrumentCount = order.get(MusicInstrument.TRUMPETS);
                    updateCount(MusicInstrument.TRUMPETS);
                    for (int i = 0; i < orderInstrumentCount; i++) {
                        output.add(new Trumpets("Golden", "Trumpets"));
                    }
                    iterator.remove();
                    break;
            }
        }
        return output;
    }
}