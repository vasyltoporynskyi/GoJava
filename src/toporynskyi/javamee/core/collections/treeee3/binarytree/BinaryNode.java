package core.collections.treeee3.binarytree;

import java.text.Collator;
import java.util.Locale;


public class BinaryNode<T extends Comparable<T>> implements Comparable<T>
{
    private T data;
    public BinaryNode<T> leftChild;
    public BinaryNode<T> rightChild;

    public BinaryNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public int compareTo(T object) {
        if (data.getClass() == String.class) {
            Collator collator = Collator.getInstance(new Locale("en", "US"));
            return collator.compare(object, data);
        }else {
            return data.compareTo(object);
        }
    }

}
