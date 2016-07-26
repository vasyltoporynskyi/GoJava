package toporynskyi.goit.FinalProject;

/**
 * Created by grant on 7/26/16.
 */
public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(int value) {
        add(value);
    }

    public Node getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int value) {
        root = add(root, value);
    }

    private Node add(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            root.setRoot(this.root);
        }else if (root.getData() >= value) {
            root.setLeftChildren(add(root.getLeftChildren(), value));
        }else if (root.getData() < value) {
            root.setRightChildren(add(root.getRightChildren(), value));
        }

        return root;

    }
}
