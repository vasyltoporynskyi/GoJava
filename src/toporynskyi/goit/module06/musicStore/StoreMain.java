package toporynskyi.goit.module06.musicStore;


import java.util.*;


/**
 * Created by grant on 6/11/16.
 */
public class StoreMain {
    public static void main(String[] args) throws NegativeValueException {

        MusicStore musicStore = new MusicStore(16, 2, 7);
        MusicStore storeOrder = new MusicStore(16, 2, 7);

        Map<String, Integer> order = new HashMap<>();

        Map<String, Integer> orderAdd = new HashMap<>();

        System.out.println("You have in Store:  \n" + musicStore.instrumentsInStore);


        System.out.println("Please make a first order! \n");
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of Guitars: ");

        Integer userInputOrderOneGuitars = Integer.valueOf(scanner.next());
        System.out.println("Enter the numbers of Trumpets: ");
        Integer userInputOrderOneTrumpets = Integer.valueOf(scanner.next());

        Integer.parseInt(String.valueOf(userInputOrderOneGuitars));
        Integer.parseInt(String.valueOf(userInputOrderOneTrumpets));

        int oderOneTrumpets = userInputOrderOneTrumpets;
        int oderOneGuitars = userInputOrderOneGuitars;


        orderAdd.put(MusicInstrument.TRUMPETS, userInputOrderOneTrumpets);
        orderAdd.put(MusicInstrument.GUITARS, userInputOrderOneGuitars);

        System.out.println("\nFirst order: (" + oderOneGuitars + " Guitars, " + oderOneTrumpets + " Trumpets)");

        try {
            storeOrder.prepareOder(orderAdd);
              }catch (NegativeValueException e){
            System.out.println("++++++++++++++++");
        }


        musicStore.prepareInstruments(order);

        System.out.println("\nMusic Instruments left in Store after first order: " + "\n" + musicStore.instrumentsInStore + "\n");

        System.out.println("Please make a Second order! \n");
        System.out.println("Enter the numbers of Pianos: ");
        Integer userInputOrderTwoPianos = Integer.valueOf(scanner.next());
        Integer.parseInt(String.valueOf(userInputOrderTwoPianos));

        int oderTwoPianos = userInputOrderTwoPianos;
        orderAdd.put(MusicInstrument.PIANOS, oderTwoPianos);

        System.out.println("\nSecond order: (" + oderTwoPianos + " Piano)");
        try {
            storeOrder.prepareOder(orderAdd);
        }catch (NegativeValueException e){
            e.getCause();
            System.out.println("++++++++++++++++");
        }
        musicStore.prepareInstruments(order);

        System.out.println("\nMusic Instruments left in Store after second order: " + "\n" + musicStore.instrumentsInStore + "\n");

        System.out.println("Enter the numbers of Pianos: ");
        Integer userInputOrderThirdPianos = Integer.valueOf(scanner.next());
        System.out.println("Please make a Third order! \n");
        System.out.println("Enter the numbers of Guitars: ");
        Integer userInputOrderThirdGuitars = Integer.valueOf(scanner.next());
        System.out.println("Enter the numbers of Trumpets: ");
        Integer userInputOrderThirdTrumpets = Integer.valueOf(scanner.next());

        Integer.parseInt(String.valueOf(userInputOrderThirdPianos));
        Integer.parseInt(String.valueOf(userInputOrderThirdGuitars));
        Integer.parseInt(String.valueOf(userInputOrderThirdTrumpets));

        int oderThreePianos = userInputOrderThirdPianos;
        int oderThreeGuitars = userInputOrderThirdGuitars;
        int oderThreeTrumpets = userInputOrderThirdTrumpets;

        orderAdd.put(MusicInstrument.PIANOS, oderThreePianos);
        orderAdd.put(MusicInstrument.GUITARS, oderThreeGuitars);
        orderAdd.put(MusicInstrument.TRUMPETS, oderThreeTrumpets);


        try {
            storeOrder.prepareOder(orderAdd);
        }catch (NegativeValueException e){
            e.getCause();
            System.out.println("++++++++++++++++");
        }
        musicStore.prepareInstruments(order);

            System.out.println("Sorry, not enough instruments in Store. We have only: " + musicStore.instrumentsInStore);
            System.out.println("Please enter the correct value. \n");
            System.out.println("Enter the numbers of Pianos: ");
            Integer userInputOrderFourPianos = Integer.valueOf(scanner.next());
            System.out.println("Please make a Third order! \n");
            System.out.println("Enter the numbers of Guitars: ");
            Integer userInputOrderFourGuitars = Integer.valueOf(scanner.next());
            System.out.println("Enter the numbers of Trumpets: ");
            Integer userInputOrderFourTrumpets = Integer.valueOf(scanner.next());

            int oderFourPianos = userInputOrderFourPianos;
            int oderFourGuitars = userInputOrderFourGuitars;
            int oderFourTrumpets = userInputOrderFourTrumpets;

        orderAdd.put(MusicInstrument.PIANOS, oderFourPianos);
        orderAdd.put(MusicInstrument.GUITARS, oderFourGuitars);
        orderAdd.put(MusicInstrument.TRUMPETS, oderFourTrumpets);
        try {
            storeOrder.prepareOder(orderAdd);
        }catch (NegativeValueException e){
            System.out.println("++++++++++++++++");
        }
        musicStore.prepareInstruments(order);

        System.out.println("\nThird order: (" + oderTwoPianos + " Piano, " + oderThreeGuitars + " Guitars, " + oderThreeTrumpets + " Trumpets" + ")");
        System.out.println("\nMusic Instruments left in Store after third order: " + "\n" + musicStore.instrumentsInStore + "\n");

    }

    }



