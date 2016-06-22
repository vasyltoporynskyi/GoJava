package toporynskyi.goit.module07.musicStoreRef;

import java.util.*;

/**
 * Created by grant on 6/15/16.
 */
class MusicStore {

    private List<MusicInstrument> musicInstrumentList;

    public List<MusicInstrument> prepareInstruments(Map<String, Integer> order) throws InstrumentException {
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

    private void orderListCheck(Map<String, Integer> order) throws InstrumentException {
        Set<String> allowedInstruments = new HashSet<>();
        Collections.addAll(allowedInstruments, "guitar", "piano", "trumpet");

        for (Map.Entry entry : order.entrySet()) {
            if (!allowedInstruments.contains(entry.getKey())) {
                throw new InstrumentException(entry.getKey().toString());
            }
            if (((Integer) entry.getValue()) <= 0) {
                throw new InstrumentException("Wrong quantity in order. Instrument [" +
                        entry.getKey() + "] has value [" + entry.getValue() + "], allowed '> 0'.");
            }
            if (((Integer) entry.getValue()) > getInstrumentQuantityInStore(entry.getKey().toString())) {
                throw new InstrumentException("Not enough quantity of [" + entry.getKey() +
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
                storeContains.put(String.valueOf(musicInstrument.getType()), storeContains.get(musicInstrument.getType()) + 1);
            } else {
                storeContains.put(String.valueOf(musicInstrument.getType()), 1);
            }
        }
        return storeContains.toString();
    }

    public int inputQuantity() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("please add quantity: ");
        return Integer.valueOf(scanner.next());
    }

    protected static List<MusicInstrument> createListInstrument(MusicInstrument instrument, int quantity) throws InstrumentException {
        List<MusicInstrument> musicInstrumentList = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {

            musicInstrumentList.add(instrument);
        }
        return musicInstrumentList;
    }

    public void setMusicInstrumentList(List<MusicInstrument> musicInstrumentList) {
        this.musicInstrumentList = musicInstrumentList;
    }
}
