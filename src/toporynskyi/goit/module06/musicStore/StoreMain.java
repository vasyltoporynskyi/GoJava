package toporynskyi.goit.module06.musicStore;


import java.util.*;


/**
 * Created by grant on 6/11/16.
 */
public class StoreMain {
    public static void main(String[] args) throws NegativeValueException {

        MusicStore musicStore = new MusicStore(16, 2, 7);

        Map<String, Integer> order = new HashMap<>();


        System.out.println("You have in Store:  \n" + musicStore.instrumentsInStore);


        System.out.println("Please make a first order! \n");
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of Guitars: ");

        Integer userInputOrderOneGuitars = Integer.valueOf(scanner.next());
        Integer.parseInt(String.valueOf(userInputOrderOneGuitars));

        System.out.println("Enter the numbers of Trumpets: ");
        Integer userInputOrderOneTrumpets = Integer.valueOf(scanner.next());


        Integer.parseInt(String.valueOf(userInputOrderOneTrumpets));

        int oderOneTrumpets = userInputOrderOneTrumpets;
        int oderOneGuitars = userInputOrderOneGuitars;


        System.out.println("\nFirst order: (" + oderOneGuitars + " Guitars, " + oderOneTrumpets + " Trumpets)");

        if (oderOneGuitars <= 7 || oderOneTrumpets <=2 ){
            order.put(MusicInstrument.TRUMPETS, userInputOrderOneTrumpets);
            order.put(MusicInstrument.GUITARS, userInputOrderOneGuitars);
            musicStore.prepareInstruments(order);
        }else {
            System.out.println("Error! There are no such number of instruments in Store! ");
        }

        System.out.println("\nMusic Instruments left in Store after first order: " + "\n" + musicStore.instrumentsInStore + "\n");

        System.out.println("Please make a Second order! \n");
        System.out.println("Enter the numbers of Pianos: ");
        Integer userInputOrderTwoPianos = Integer.valueOf(scanner.next());
        Integer.parseInt(String.valueOf(userInputOrderTwoPianos));

        int oderTwoPianos = userInputOrderTwoPianos;


        System.out.println("\nSecond order: (" + oderTwoPianos + " Piano)");


        if (oderTwoPianos <= 1){
            order.put(MusicInstrument.PIANOS, oderTwoPianos);
            musicStore.prepareInstruments(order);
        }else {
            System.out.println("Error! There are no such number of instruments in Store! ");
        }

        System.out.println("\nMusic Instruments left in Store after second order: " + "\n" + musicStore.instrumentsInStore + "\n");
        System.out.println("Please make a Third order! \n");

        System.out.println("Enter the numbers of Pianos: ");
        Integer userInputOrderThirdPianos = Integer.valueOf(scanner.next());

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

        if (oderThreePianos <= 1 | oderThreeGuitars <= 9 | oderThreeTrumpets <= 5){

                order.put(MusicInstrument.PIANOS, oderThreePianos);
                order.put(MusicInstrument.GUITARS, oderThreeGuitars);
                order.put(MusicInstrument.TRUMPETS, oderThreeTrumpets);
                  musicStore.prepareInstruments(order);
        }else {
            System.out.println("Error! There are no such number of instruments in Store! ");

        }

        System.out.println("\nThird order: (" + oderTwoPianos + " Piano, " + oderThreeGuitars + " Guitars, " + oderThreeTrumpets + " Trumpets" + ")");
        System.out.println("\nMusic Instruments left in Store after third order: " + "\n" + musicStore.instrumentsInStore + "\n");


    }



}