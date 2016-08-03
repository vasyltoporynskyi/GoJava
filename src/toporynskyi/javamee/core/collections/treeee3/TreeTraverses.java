package core.collections.treeee3;

import core.collections.treeee3.binarytree.BinaryNode;

import java.util.function.Consumer;


public interface TreeTraverses
{
    void orderTraver(BinaryNode root, Consumer<BinaryNode> callback);

}
