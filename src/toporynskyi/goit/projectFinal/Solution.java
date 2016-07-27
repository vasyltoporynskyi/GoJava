package toporynskyi.goit.projectFinal;

import toporynskyi.goit.projectFinal.binarytree.BinaryTree;
import toporynskyi.goit.projectFinal.ordertraver.inOrderTraver;

/**
 * Created by grant on 7/27/16.
 */
public class Solution {

    public static void main(String[] args) {
//        BinaryTree<Integer> binaryTree = new BinaryTree<>();
//        binaryTree.add(5);
//        binaryTree.add(10);
//        binaryTree.add(-1);
//        binaryTree.add(8);
//        binaryTree.add(50);
//        binaryTree.add(3);

        BinaryTree<Float> binaryTree = new BinaryTree<>();
        binaryTree.add(5.6F);
        binaryTree.add(10.2F);
        binaryTree.add(-1.00002F);
        binaryTree.add(3.67F);
        binaryTree.add(50F);
        binaryTree.add(3.32F);

//        TreeTraverse.preOrderTraver(binaryTree.root, node-> System.out.println(node.data));
//        TreeTraverse.inOrderTraver(binaryTree.root, node-> System.out.println(node.data));

        binaryTree.setTypeTravers(new inOrderTraver());
        binaryTree.getRevers(binaryTree.root, node -> System.out.println(node.getData()));

//        binaryTree.setTypeTravers(new preOrderTraver());
//        binaryTree.getRevers(binaryTree.root, node -> System.out.println(node.data));

    }

}
