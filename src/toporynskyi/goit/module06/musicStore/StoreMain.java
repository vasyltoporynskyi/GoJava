package toporynskyi.goit.module06.musicStore;


import java.util.*;


/**
 * Created by grant on 6/11/16.
 */
public class StoreMain {
    public static void main(String[] args) throws NegativeValueException {

        // anit-pattern "Hard code" внесение данных о наличее товара должно осуществляться отдельным методом, а не прописываться в коде.
        // anit-pattern "Magic number".
        MusicStore musicStore = new MusicStore(16, 2, 7);

        Map<String, Integer> order = new HashMap<>();

        // anit-pattern "Hard code" Вывод информации для пользователя. Необходимо вынести в отдельный метод/класс.
        // anit-pattern "Copy/Paste" Дублирование механизма вывода информации при каждой операции.
        System.out.println("You have in Store:  \n" + musicStore.instrumentsInStore);

        // anit-pattern "Hard code" Вывод информации для пользователя. Необходимо вынести в отдельный метод/класс.
        // anit-pattern "Copy/Paste" Дублирование механизма вывода информации при каждой операции.
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
        // anit-pattern "Hard code" внесение данных о наличее товара должно осуществляться отдельным методом, а не прописываться в коде.
        // anit-pattern "Magic number".
        if (oderOneGuitars > 7 || oderOneTrumpets > 2 ){
            System.out.println("Error! There are no such number of instruments in Store! ");


        }else {
            order.put(MusicInstrument.TRUMPETS, userInputOrderOneTrumpets);
            order.put(MusicInstrument.GUITARS, userInputOrderOneGuitars);
            musicStore.prepareInstruments(order);
        }
        // anit-pattern "Hard code" Вывод информации для пользователя. Необходимо вынести в отдельный метод/класс.
        // anit-pattern "Copy/Paste" Дублирование механизма вывода информации при каждой операции.

        System.out.println("\nMusic Instruments left in Store after first order: " + "\n" + musicStore.instrumentsInStore + "\n");

        System.out.println("Please make a Second order! \n");
        System.out.println("Enter the numbers of Pianos: ");
        Integer userInputOrderTwoPianos = Integer.valueOf(scanner.next());
        Integer.parseInt(String.valueOf(userInputOrderTwoPianos));

        int oderTwoPianos = userInputOrderTwoPianos;
        // anit-pattern "Hard code" Вывод информации для пользователя. Необходимо вынести в отдельный метод/класс.
        // anit-pattern "Copy/Paste" Дублирование механизма вывода информации при каждой операции.

        System.out.println("\nSecond order: (" + oderTwoPianos + " Piano)");


        // anit-pattern "Magic number". Недопустимая конструкция. Услови нужно построить так, чтоб оно проверяло наличие товара в магазине.
        if (oderTwoPianos > 1){
            System.out.println("Error! There are no such number of instruments in Store! ");

        }else {
            order.put(MusicInstrument.PIANOS, oderTwoPianos);
            musicStore.prepareInstruments(order);
        }
        // anit-pattern "Hard code" Вывод информации для пользователя. Необходимо вынести в отдельный метод/класс.
        // anit-pattern "Copy/Paste" Дублирование механизма вывода информации при каждой операции.

        System.out.println("\nMusic Instruments left in Store after second order: " + "\n" + musicStore.instrumentsInStore + "\n");
        System.out.println("Please make a Third order! \n");

        // anit-pattern "Hard code" Вывод информации для пользователя. Необходимо вынести в отдельный метод/класс.
        // anit-pattern "Copy/Paste" Дублирование механизма вывода информации при каждой операции.
        System.out.println("Enter the numbers of Pianos: ");
        Integer userInputOrderThirdPianos = Integer.valueOf(scanner.next());

        // anit-pattern "Hard code" Вывод информации для пользователя. Необходимо вынести в отдельный метод/класс.
        // anit-pattern "Copy/Paste" Дублирование механизма вывода информации при каждой операции.
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

        // anit-pattern "Magic number". Недопустимая конструкция. Услови нужно построить так, чтоб оно проверяло наличие товара в магазине.
        if (oderThreePianos < 1 || oderThreeGuitars < 9 || oderThreeTrumpets < 5){
            System.out.println("Error! There are no such number of instruments in Store! ");
        }else {
            order.put(MusicInstrument.PIANOS, oderThreePianos);
            order.put(MusicInstrument.GUITARS, oderThreeGuitars);
            order.put(MusicInstrument.TRUMPETS, oderThreeTrumpets);
            musicStore.prepareInstruments(order);
        }
        // anit-pattern "Hard code" Вывод информации для пользователя. Необходимо вынести в отдельный метод/класс.
        // anit-pattern "Copy/Paste" Дублирование механизма вывода информации при каждой операции.
        System.out.println("\nThird order: (" + oderTwoPianos + " Piano, " + oderThreeGuitars + " Guitars, " + oderThreeTrumpets + " Trumpets" + ")");
        System.out.println("\nMusic Instruments left in Store after third order: " + "\n" + musicStore.instrumentsInStore + "\n");


    }



}