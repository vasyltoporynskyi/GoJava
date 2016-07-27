package toporynskyi.goit.projectFinal;

import toporynskyi.goit.projectFinal.binarytree.BinaryNode;

import java.util.function.Consumer;

/**
 * Created by grant on 7/27/16.
 */
public interface TreeTraverses {
    void orderTraver(BinaryNode root, Consumer<BinaryNode> callback);

}
