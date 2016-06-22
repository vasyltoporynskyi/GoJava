package toporynskyi.goit.module07.musicStoreRef;

import javax.management.InvalidAttributeValueException;
import javax.naming.SizeLimitExceededException;
import java.util.*;

/**
 * Created by grant on 6/15/16.
 */
public class MainMusicStore {
    public static void main(String[] args) throws InstrumentException {

        MusicStore musicStore = new MusicStore();
        List<MusicInstrument> instrumentsInStore = new ArrayList<>();
        instrumentsInStore.addAll(MusicStore.createListInstrument(new Guitar(), 16));
        instrumentsInStore.addAll(MusicStore.createListInstrument(new Piano(), 2));
        instrumentsInStore.addAll(MusicStore.createListInstrument(new Trumpet(), 7));
        musicStore.setMusicInstrumentList(instrumentsInStore);
        System.out.println("Instruments in Store:\t" + musicStore);

        Map<String, Integer> order1 = new HashMap<>();

        System.out.print("Add Guitars to Order 1, ");
        order1.put("guitar", musicStore.inputQuantity());
        System.out.print("Add Trumpets to Order 1, ");
        order1.put("trumpet", musicStore.inputQuantity());
        System.out.println("Order 1: " + order1);
        try {
            musicStore.prepareInstruments(order1);
        } catch (InstrumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Instruments in Store after Order 1:\t" + musicStore);

        Map<String, Integer> order2 = new HashMap<>();
        System.out.print("Add Pianos to Order 2, ");
        order2.put("piano", musicStore.inputQuantity());
        System.out.println("Order 2: " + order2);
        try {
            musicStore.prepareInstruments(order2);
        } catch (InstrumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Instruments in Store after Order 2:\t" + musicStore);

        Map<String, Integer> order3 = new HashMap<>();
        System.out.print("Add Pianos to Order 3, ");
        order3.put("piano", musicStore.inputQuantity());
        System.out.print("Add Guitars to Order 3, ");
        order3.put("guitar", musicStore.inputQuantity());
        System.out.print("Add Trumpets to Order 3, ");
        order3.put("trumpet", musicStore.inputQuantity());
        System.out.println("Order 3: " + order3);
        try {
            musicStore.prepareInstruments(order3);
        } catch (InstrumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Instruments in Store after Order 2:\t" + musicStore);

            Map<String, Integer> order4 = new HashMap<>();
            System.out.print("Add Pianos to Order 3, ");
            order4.put("piano", musicStore.inputQuantity());
            System.out.print("Add Guitars to Order 3, ");
            order4.put("guitar", musicStore.inputQuantity());
            System.out.print("Add Trumpets to Order 3, ");
            order4.put("trumpet", musicStore.inputQuantity());
            System.out.println("Order 3: " + order4);
            musicStore.prepareInstruments(order4);

        }
        System.out.println("Instruments in Store after Order 3:\t" + musicStore);
    }
}
