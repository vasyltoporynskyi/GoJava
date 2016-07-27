package toporynskyi.goit.projectFinal.binarytree;

/**
 * Created by grant on 7/27/16.
 */
public class BinaryNode<T extends Number & Comparable<T>> implements Comparable<T>
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

        return data.compareTo(object);
    }
}