package core.collections.treeee3;

import core.collections.treeee3.binarytree.BinaryNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GraphTreePrinter
{

    public static void printNode(BinaryNode root) {
        int maxLevel = GraphTreePrinter.maxLevel(root);

        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static void printNodeInternal(List<BinaryNode> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || GraphTreePrinter.isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        GraphTreePrinter.printWhitespaces(firstSpaces);

        List<BinaryNode> newNodes = new ArrayList<>();
        for (BinaryNode node : nodes) {
            if (node != null) {
                System.out.print(node.getData());
                newNodes.add(node.leftChild);
                newNodes.add(node.rightChild);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            GraphTreePrinter.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                GraphTreePrinter.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    GraphTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).leftChild != null)
                    System.out.print("/");
                else
                    GraphTreePrinter.printWhitespaces(1);

                GraphTreePrinter.printWhitespaces(i + i - 1);

                if (nodes.get(j).rightChild != null)
                    System.out.print("\\");
                else
                    GraphTreePrinter.printWhitespaces(1);

                GraphTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private static int maxLevel(BinaryNode node) {
        if (node == null)
            return 0;

        return Math.max(GraphTreePrinter.maxLevel(node.leftChild), GraphTreePrinter.maxLevel(node.rightChild)) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

}
