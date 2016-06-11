package toporynskyi.goit.module06.musicStore;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by grant on 6/11/16.
 */
public class StoreMain {
    public static void main(String[] args) throws NegativeValueException {

        MusicStore musicStore = new MusicStore(16, 2, 7);

        Map<String, Integer> order = new HashMap<>();

        System.out.println("You have in Store:  \n" + musicStore.instrumentsInStore);

        int oderOneTrumpets = 2;
        int oderOneGuitars = 7;
        order.put(MusicInstrument.TRUMPETS, oderOneTrumpets);
        order.put(MusicInstrument.GUITARS, oderOneGuitars);

        System.out.println("\nFirst order: ("+ oderOneGuitars +" Guitars, " + oderOneTrumpets + " Trumpets)");
        musicStore.prepareInstruments(order);
        System.out.println("\nMusic Instruments left in Store after first order: " + "\n" + musicStore.instrumentsInStore + "\n");

        int oderTwoPianos = 1;
        order.put(MusicInstrument.PIANOS, oderTwoPianos);

        System.out.println("\nSecond order: ("+ oderTwoPianos +" Piano)");
        musicStore.prepareInstruments(order);
        System.out.println("\nMusic Instruments left in Store after second order: " + "\n" + musicStore.instrumentsInStore + "\n");

        int oderThreeTrumpets = 6;
        int oderThreePianos = 1;
        int oderThreeGuitars = 8;
        order.put(MusicInstrument.TRUMPETS, oderThreeTrumpets);
        order.put(MusicInstrument.PIANOS, oderThreePianos);
        order.put(MusicInstrument.GUITARS, oderThreeGuitars);

        System.out.println("\nThird order: ("+ oderTwoPianos +" Piano, " + oderThreeGuitars +" Guitars, " + oderThreeTrumpets + " Trumpets" + ")");
        musicStore.prepareInstruments(order);
        System.out.println("\nMusic Instruments left in Store after third order: " + "\n" + musicStore.instrumentsInStore + "\n");


    }

}