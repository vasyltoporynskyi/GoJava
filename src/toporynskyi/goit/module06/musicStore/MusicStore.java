package toporynskyi.goit.module06.musicStore;


import java.util.*;


/**
 * Created by grant on 5/31/16.
 */
public class MusicStore {
    private int orderInstrumentCount = 0;
    private int storeInstrumentCount;

    Map<String, Integer> instrumentsInStore = new HashMap<>();


    public MusicStore(int guitarCountInStore, int pianoCountInStore, int trumpetCountInStore) {
        instrumentsInStore.put(MusicInstrument.GUITARS, guitarCountInStore);
        instrumentsInStore.put(MusicInstrument.PIANOS, pianoCountInStore);
        instrumentsInStore.put(MusicInstrument.TRUMPETS, trumpetCountInStore);
    }



    public void updateCount(String product) throws NegativeValueException {


        int currInstrumentCountInStore = instrumentsInStore.get(product);
        int instrumentCountLeftInStore = currInstrumentCountInStore - orderInstrumentCount;
        storeInstrumentCount = instrumentCountLeftInStore;

        if (currInstrumentCountInStore < orderInstrumentCount) {
            throw new NegativeValueException("Error! There are no such number of instruments in Store! ");
        } else if(orderInstrumentCount == 0) {
            throw new NegativeValueException("Error! Order can`t be generated with zero number of instruments! ");
        } else{
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
                        output.getClass();
                    }
                    iterator.remove();
                    break;

                case MusicInstrument.PIANOS:
                    orderInstrumentCount = order.get(MusicInstrument.PIANOS);
                    updateCount(MusicInstrument.PIANOS);
                    for (int i = 0; i < orderInstrumentCount; i++) {
                        output.getClass();
                    }
                    iterator.remove();
                    break;

                case MusicInstrument.TRUMPETS:
                    orderInstrumentCount = order.get(MusicInstrument.TRUMPETS);
                    updateCount(MusicInstrument.TRUMPETS);
                    for (int i = 0; i < orderInstrumentCount; i++) {
                        output.getClass();
                    }
                    iterator.remove();
                    break;
            }
        }
        return output;
    }


    public int getStoreGuitarCount() {
        return storeInstrumentCount;
    }
    public int getStorePianosCount() {
        return storeInstrumentCount;
    }
    public int getStoreTrumpetsCount() {
        return storeInstrumentCount;
    }
}