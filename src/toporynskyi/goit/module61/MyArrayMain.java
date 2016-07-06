package toporynskyi.goit.module61;

/**
 * Created by grant on 7/4/16.
 */
public class MyArrayMain {
    public static void main(String [] args){

        MyArrayList array = new MyArrayList();

        System.out.println("Array is empty: " + array.isEmpty() + "\n" + "Adding some values...");

        //Default capacity of elements = 5
        //If the number of elements are more then 5, MyArrayList extend size with method growArray
        array.add(15);
        array.add(1);
        array.add(2);
        array.add(42);
        array.add(6);
        array.add(8);
        array.add(79);
        array.add(33);
        array.add(41);

        System.out.println("Actual array size: " + array.size());
        System.out.println("Value of the last index: " + array.get(7));
        System.out.println("Array is empty: " + array.isEmpty());
    }
}
