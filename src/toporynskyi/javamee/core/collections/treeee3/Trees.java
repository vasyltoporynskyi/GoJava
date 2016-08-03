package core.collections.treeee3;

import core.collections.treeee3.binarytree.BinaryNode;

import java.util.function.Consumer;

/**
 * Created by ukr-sustavov on 27.07.2016.
 */
public abstract class Trees
{
    TreeTraverses typeTravers;

    public void setTypeTravers(TreeTraverses newType) {
        this.typeTravers = newType;
    }

    public void getRevers(BinaryNode root, Consumer<BinaryNode> callback) {
        typeTravers.orderTraver(root, callback);
    }
}
