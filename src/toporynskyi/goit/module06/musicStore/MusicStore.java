package toporynskyi.goit.module06.musicStore;


import java.util.*;


/**
 * Created by grant on 5/31/16.
 */
public class MusicStore {

    private int orderInstrumentCount = 0;
    private int storeInstrumentCount = 0;


    Map<String, Integer> instrumentsInStore = new HashMap<>();
    Map<String, Integer> orderList = new HashMap<>();

    public MusicStore(int guitarCountInStore, int pianoCountInStore, int trumpetCountInStore) {
        instrumentsInStore.put(MusicInstrument.GUITARS, guitarCountInStore);
        instrumentsInStore.put(MusicInstrument.PIANOS, pianoCountInStore);
        instrumentsInStore.put(MusicInstrument.TRUMPETS, trumpetCountInStore);
    }



    public void updateCount(String product) throws NegativeValueException {

        int currInstrumentCountInStore = instrumentsInStore.get(product);
        int currInstrumentCountInOrder = orderList.get(product);

        int instrumentCountLeftInStore = currInstrumentCountInStore - storeInstrumentCount;
        int instrumentCountLeftInOder = currInstrumentCountInOrder - orderInstrumentCount;

        if (currInstrumentCountInStore < storeInstrumentCount) {
            throw new NegativeValueException("Error! There are no such number of instruments in Store! ");
        } else if(orderInstrumentCount == 0) {
            throw new NegativeValueException("Error! Order can`t be generated with zero number of instruments! ");
        } else{
            instrumentsInStore.put(product, instrumentCountLeftInStore);
            orderList.put(product, instrumentCountLeftInOder);
        }

    }



    public List<MusicInstrument> prepareOder(Map<String, Integer> orderAdd) throws NegativeValueException {

        List<MusicInstrument> newOrder = new ArrayList<>();

        Set<String> instruments = orderAdd.keySet();
        Iterator<String> iterator = instruments.iterator();

        while (iterator.hasNext()) {

            switch (iterator.next()) {
                case MusicInstrument.GUITARS:
                    orderInstrumentCount = orderAdd.get(MusicInstrument.GUITARS);
                    updateCount(MusicInstrument.GUITARS);
                    for (int i = 0; i < orderInstrumentCount; i++) {
                        newOrder.getClass();
                    }
                    iterator.remove();
                    break;

                case MusicInstrument.PIANOS:
                    orderInstrumentCount = orderAdd.get(MusicInstrument.PIANOS);
                    updateCount(MusicInstrument.PIANOS);
                    for (int i = 0; i < orderInstrumentCount; i++) {
                        newOrder.getClass();
                    }
                    iterator.remove();
                    break;

                case MusicInstrument.TRUMPETS:
                    orderInstrumentCount = orderAdd.get(MusicInstrument.TRUMPETS);
                    updateCount(MusicInstrument.TRUMPETS);
                    for (int i = 0; i < orderInstrumentCount; i++) {
                        newOrder.getClass();
                    }
                    iterator.remove();
                    break;
            }
        }
        return newOrder;
    }


    public List<MusicInstrument> prepareInstruments(Map<String, Integer> order) throws NegativeValueException {

        List<MusicInstrument> output = new ArrayList<>();
        Set<String> instruments = order.keySet();
        Iterator<String> iterator = instruments.iterator();

        while (iterator.hasNext()) {

            switch (iterator.next()) {
                case MusicInstrument.GUITARS:
                    storeInstrumentCount = order.get(MusicInstrument.GUITARS);
                    updateCount(MusicInstrument.GUITARS);
                    for (int i = 0; i < storeInstrumentCount; i++) {
                        output.getClass();
                    }
                    iterator.remove();
                    break;

                case MusicInstrument.PIANOS:
                    storeInstrumentCount = order.get(MusicInstrument.PIANOS);
                    updateCount(MusicInstrument.PIANOS);
                    for (int i = 0; i < storeInstrumentCount; i++) {
                        output.getClass();
                    }
                    iterator.remove();
                    break;

                case MusicInstrument.TRUMPETS:
                    storeInstrumentCount = order.get(MusicInstrument.TRUMPETS);
                    updateCount(MusicInstrument.TRUMPETS);
                    for (int i = 0; i < storeInstrumentCount; i++) {
                        output.getClass();
                    }
                    iterator.remove();
                    break;
            }
        }
        return output;
        }

    }