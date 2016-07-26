package toporynskyi.goit.FinalProject;

/**
 * Created by grant on 7/26/16.
 */
public class Solution {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.add(15);
        binarySearchTree.add(18);
        binarySearchTree.add(8);
        binarySearchTree.add(10);

        System.out.println(binarySearchTree.getRoot().getData());
        System.out.println(binarySearchTree.getRoot().getLeftChildren().getData());
        System.out.println(binarySearchTree.getRoot().getRightChildren());
//        System.out.println(null);
//        binarySearchTree.getRoot().getRightChildren().getData();

//        TreeTraverse.preOrderTraver(binarySearchTree.getRoot());
        //TreeTraverse.inOrderTraver(binarySearchTree.getRoot());

        TreeTraverse.preOrderTraver(binarySearchTree.getRoot(), node-> System.out.println(node.getData()));
    }
}
