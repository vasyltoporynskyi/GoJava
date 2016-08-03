package core.collections.treeee3.binarytree;

import core.collections.treeee3.Trees;



public class BinaryTree<T extends Comparable<T>> extends Trees
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

    public boolean isEmpty() {
        return root == null;
    }

}
