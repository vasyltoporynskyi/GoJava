package toporynskyi.goit.FinalProject;

/**
 * Created by grant on 7/26/16.
 */
public class Node {
    private Node leftChildren;
    private Node rightChildren;
    private int data;
    private Node root;
    private int index;
    private static int length;

    public Node(int data) {
        leftChildren = null;
        rightChildren = null;
        this.data = data;
        index = ++length;
    }

    public int getData() {
        return data;
    }

    public int getIndex() {
        return index;
    }

    public Node getLeftChildren() {
        return leftChildren;
    }

    public Node getRightChildren() {
        return rightChildren;
    }

    public void setLeftChildren(Node leftChildren) {
        this.leftChildren = leftChildren;
    }

    public void setRightChildren(Node rightChildren) {
        this.rightChildren = rightChildren;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }
}
