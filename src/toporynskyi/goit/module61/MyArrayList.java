package toporynskyi.goit.module61;

/**
 * Created by grant on 7/4/16.
 */
public class MyArrayList {
    private int[] elements;
    private int size;
    private int index;

    private static final int CAPACITY = 5;

    public MyArrayList() {
        elements = new int[CAPACITY];
    }

    public void add(int value) {
        if (index == elements.length)
            growArray();
        elements[index] = value;
        index++;
        size++;
    }

    private void growArray() {
        int[] newArray = new int[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, index - 1);
        elements = newArray;
    }

    public int get(int index) {
        checkIndex(index);
        return elements[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.index)
            throw new IllegalArgumentException();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}