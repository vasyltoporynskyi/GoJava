package toporynskyi.javamee.core.collections.treeee3;

import toporynskyi.javamee.core.collections.treeee3.binarytree.BinaryTree;

import java.util.List;


public class TreeMaker
{

    public static BinaryTree<Double> makeDoubleTree(List<String> currentLine, String commandPrefix) throws NumberFormatException {

        BinaryTree<Double> binaryTree = new BinaryTree<>();

        for (String str : currentLine)
        {
            if (Instruction.isContained(str, commandPrefix))
            {
                continue;
            }
            binaryTree.add(Double.parseDouble(str));
        }

        return binaryTree;
    }

    public static BinaryTree<Float> makeFloatTree(List<String> currentLine, String commandPrefix) throws NumberFormatException {

        BinaryTree<Float> binaryTree = new BinaryTree<>();

        for (String str : currentLine)
        {
            if (Instruction.isContained(str, commandPrefix))
            {
                continue;
            }
            binaryTree.add(Float.parseFloat(str));
        }

        return binaryTree;
    }

    public static BinaryTree<String> makeStringTree(List<String> currentLine, String commandPrefix) {

        BinaryTree<String> binaryTree = new BinaryTree<>();

        for (String str : currentLine)
        {
            if (Instruction.isContained(str, commandPrefix))
            {
                continue;
            }
            binaryTree.add(str);
        }

        return binaryTree;
    }
}
