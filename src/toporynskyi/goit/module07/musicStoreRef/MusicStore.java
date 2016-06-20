package toporynskyi.goit.module07.musicStoreRef;

import javax.management.InvalidAttributeValueException;
import javax.naming.SizeLimitExceededException;
import java.util.*;

/**
 * Created by grant on 6/15/16.
 */
class MusicStore {

    private List<MusicInstrument> musicInstrumentList;

    public List<MusicInstrument> prepareInstruments(Map<String, Integer> order) throws InstrumentException, InvalidAttributeValueException, SizeLimitExceededException {
        if (order == null) return null;
        orderListCheck(order);

        List<MusicInstrument> result = new ArrayList<>();

        for (Map.Entry orderItem : order.entrySet()) {
            Integer neededQuantity = ((Integer) orderItem.getValue());
            Iterator<MusicInstrument> iterator = musicInstrumentList.iterator();

            while (iterator.hasNext()) {
                MusicInstrument iteratedInstrument = iterator.next();
                if (iteratedInstrument.getType().equals(orderItem.getKey()) && neededQuantity > 0) {
                    result.add(iteratedInstrument);
                    iterator.remove();
                    neededQuantity--;
                }
            }
        }
        return result;
    }

    private void orderListCheck(Map<String, Integer> order) throws InstrumentException, InvalidAttributeValueException, SizeLimitExceededException {
        Set<String> allowedInstruments = new HashSet<>();
        Collections.addAll(allowedInstruments, "guitar", "piano", "trumpet");

        for (Map.Entry entry : order.entrySet()) {
            if (!allowedInstruments.contains(entry.getKey())) {
                throw new InstrumentException(entry.getKey().toString());
            }
            if (((Integer) entry.getValue()) <= 0) {
                throw new InvalidAttributeValueException("Wrong quantity in order. Instrument [" +
                        entry.getKey() + "] has value [" + entry.getValue() + "], allowed '> 0'.");
            }
            if (((Integer) entry.getValue()) > getInstrumentQuantityInStore(entry.getKey().toString())) {
                throw new SizeLimitExceededException("Not enough quantity of [" + entry.getKey() +
                        "]. In store [" + getInstrumentQuantityInStore(entry.getKey().toString()) +
                        "]. In order [" + entry.getValue() + "].");
            }
        }
    }

    private Integer getInstrumentQuantityInStore(String instrument) {
        Integer result = 0;
        for (MusicInstrument musicInstrument : musicInstrumentList) {
            if (instrument.equals(musicInstrument.getType())) result++;
        }
        return result;
    }

    @Override
    public String toString() {
        Map<String, Integer> storeContains = new HashMap<>();
        for (MusicInstrument musicInstrument : musicInstrumentList) {
            if (storeContains.containsKey(musicInstrument.getType())) {
                storeContains.put(musicInstrument.getType(), storeContains.get(musicInstrument.getType()) + 1);
            } else {
                storeContains.put(musicInstrument.getType(), 1);
            }
        }
        return storeContains.toString();
    }

    public int inputQuantity(){
        final Scanner scanner = new Scanner(System.in);
        System.out.println("please add quantity: ");
        Integer userInputItem = Integer.valueOf(scanner.next());
        Integer.parseInt(String.valueOf(userInputItem));
        int inputItem = userInputItem;
        return inputItem;
    }

    protected static List<MusicInstrument> createListInstrument(MusicInstrument instrument, int quantity) {
        List<MusicInstrument> musicInstrumentList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            try {
                musicInstrumentList.add(instrument.getClass().newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return musicInstrumentList;
    }

    public void setMusicInstrumentList(List<MusicInstrument> musicInstrumentList) {
        this.musicInstrumentList = musicInstrumentList;
    }
}
