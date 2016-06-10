package toporynskyi.goit.module04.figureArea;


import java.util.Scanner;

/**
 * Created by grant on 6/3/16.
 */
public class CalculatesArea {

    public static void main(String[] args) {

        System.out.println("Enter First Value: ");
        final Scanner scanner = new Scanner(System.in);
        final String userInput1 = String.valueOf(scanner.next());
        System.out.println("Enter Second Value: ");
        final String userInput2 = String.valueOf(scanner.next());


        Double inputValue1 = new Double(userInput1);
        Double inputValue2 = new Double(userInput2);

        Figure circle = new Circle(inputValue1);
        Figure triangle = new Triangle(inputValue1, inputValue2);
        Figure rectangle = new Rectangle(inputValue1, inputValue2);


        circle.showResult();
        triangle.showResult();
        rectangle.showResult();
    }
}