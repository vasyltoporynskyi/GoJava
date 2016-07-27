package toporynskyi.goit.projectFinal.ordertraver;

import toporynskyi.goit.projectFinal.TreeTraverses;
import toporynskyi.goit.projectFinal.binarytree.BinaryNode;

import java.util.function.Consumer;

/**
 * Created by grant on 7/27/16.
 */
public class inOrderTraver implements TreeTraverses
{
    @Override
    public void orderTraver(BinaryNode root, Consumer<BinaryNode> callback)
    {
        if (root == null) {
            return;
        }
        orderTraver(root.leftChild, callback);
        callback.accept(root);
        orderTraver(root.rightChild, callback);
    }
}
