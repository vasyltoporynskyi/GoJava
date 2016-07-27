package toporynskyi.goit.projectFinal.binarytree;

import toporynskyi.goit.projectFinal.Trees;

/**
 * Created by grant on 7/27/16.
 */
public class BinaryTree<T extends Number & Comparable<T>> extends Trees
{
    public BinaryNode<T> root;

    @SuppressWarnings("unchecked")
    public void add(T value) {
        root = add(root, value);
    }

    @SuppressWarnings("unchecked")
    private BinaryNode<T> add(BinaryNode<T> root, T value) {
        if (root == null) {
            root = new BinaryNode<>(value);
        }else if (root.compareTo(value) >= 0) {
            root.leftChild = add(root.leftChild, value);
        }else {
            root.rightChild = add(root.rightChild, value);
        }

        return root;

    }

}