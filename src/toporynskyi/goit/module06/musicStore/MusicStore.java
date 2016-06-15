package toporynskyi.goit.module06.musicStore;


import java.util.*;


/**
 * Created by grant on 5/31/16.
 */
public class MusicStore {


    private int orderInstrumentCount = 0;
    // anit-pattern "Boat anchor", "storeInstrumentCount" не используется.
    private int storeInstrumentCount;

    Map<String, Integer> instrumentsInStore = new HashMap<>();

    // anit-pattern "Hard code", добавление м магазин должно осуществляться отдельным методом.
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


  //anit-pattern, необходимо добавить массив List<> для формирования списка заказов, и проверить его валидность (с остатком на в магазине) прежде чем отгружать товар.


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
                        //anit-pattern, возвращает змыкание класса.
                        output.getClass();
                    }
                    iterator.remove();
                    break;

                case MusicInstrument.PIANOS:
                    orderInstrumentCount = order.get(MusicInstrument.PIANOS);
                    updateCount(MusicInstrument.PIANOS);
                    for (int i = 0; i < orderInstrumentCount; i++) {
                        //anit-pattern, возвращает змыкание класса.
                        output.getClass();
                    }
                    iterator.remove();
                    break;

                case MusicInstrument.TRUMPETS:
                    orderInstrumentCount = order.get(MusicInstrument.TRUMPETS);
                    updateCount(MusicInstrument.TRUMPETS);
                    for (int i = 0; i < orderInstrumentCount; i++) {
                        //anit-pattern, возвращает змыкание класса.
                        output.getClass();
                    }
                    iterator.remove();
                    break;
            }
        }
        return output;
    }

    // anit-pattern "Boat anchor" не используемые методы.
    // Необходимо переписать код так, чтоб был один метод "getStoreInstrumentCount", который будет возвращать запрашиваемый остаток в магазине.
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