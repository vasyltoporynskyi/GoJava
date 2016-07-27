package toporynskyi.goit.projectFinal;

import toporynskyi.goit.projectFinal.binarytree.BinaryNode;

import java.util.function.Consumer;

/**
 * Created by grant on 7/27/16.
 */
public abstract class Trees {
    TreeTraverses typeTravers;

    public void setTypeTravers(TreeTraverses newType) {
        this.typeTravers = newType;
    }

    public void getRevers(BinaryNode root, Consumer<BinaryNode> callback) {
        typeTravers.orderTraver(root, callback);
    }
}
