package toporynskyi.javamee.core.collections.treeee3.ordertraver;

import toporynskyi.javamee.core.collections.treeee3.TreeTraverses;
import toporynskyi.javamee.core.collections.treeee3.binarytree.BinaryNode;

import java.util.function.Consumer;


public class postOrderTraver implements TreeTraverses {
    @Override
    public void orderTraver(BinaryNode root, Consumer<BinaryNode> callback) {
        if (root == null) {
            return;
        }
        orderTraver(root.leftChild, callback);
        orderTraver(root.rightChild, callback);
        callback.accept(root);
    }
}
