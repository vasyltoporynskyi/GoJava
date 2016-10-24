package toporynskyi.javamee.core.collections.treeee3;

import toporynskyi.javamee.core.collections.treeee3.binarytree.BinaryTree;
import toporynskyi.javamee.core.collections.treeee3.ordertraver.defaultOrderTraver;
import toporynskyi.javamee.core.collections.treeee3.ordertraver.inOrderTraver;
import toporynskyi.javamee.core.collections.treeee3.ordertraver.postOrderTraver;
import toporynskyi.javamee.core.collections.treeee3.ordertraver.preOrderTraver;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.*;


public class Solution {

    static Integer key = 0;
    static Map<Integer, BinaryTree> treeMap = new HashMap<>();
    static final String commandPrefix = "-";

    public static void main(String[] args) throws JAXBException {
        final String greeting = "# GoIT team № 3: Anton Sustavov, Vasiliy Toporinskiy, Vladimir Shevel"
                + System.lineSeparator() + "Trees with inorder, preorder and postorder travers"
                + System.lineSeparator() + "for help enter -h, for exit enter -q";
        final String helping = "-b --> Create binary tree"
                + System.lineSeparator() + "Example: 2 4 5 7 10 -b"
                + System.lineSeparator() + "-f --> Float tree"
                + System.lineSeparator() + "-d --> Double tree"
                + System.lineSeparator() + "Example: 2 4 5 7 10 -b (-f || -d)"
                + System.lineSeparator() + "-r path to file --> read data from file"
                + System.lineSeparator() + "Example: -r \"C:\\1\\1.txt\""
                + System.lineSeparator() + "-list --> Print all your trees"
                + System.lineSeparator() + "-list -in --> Print all your trees"
                + System.lineSeparator() + "-list -pre --> Print all your trees"
                + System.lineSeparator() + "-list -post --> Print all your trees"
                + System.lineSeparator() + "-list -graph --> Print all your trees";

        System.out.println(greeting);
        Scanner in = new Scanner(System.in);

        while (true) {

            List<String> currentLine = Arrays.asList(in.nextLine().split(" "));
            if (currentLine.contains(commandPrefix + Instruction.q)) {
                break;
            }

            if (currentLine.contains(commandPrefix + Instruction.h)) {
                System.out.println(helping);
            }

            if (currentLine.contains(commandPrefix + Instruction.b) && currentLine.contains(commandPrefix + Instruction.d))
            {
                try
                {
                    treeMap.put(++key, TreeMaker.makeDoubleTree(currentLine, commandPrefix));

                }catch (NumberFormatException e) {
                    System.out.println("Something wrong with parsing, please try again later...");
                    key--;
                }

            } else if (currentLine.contains(commandPrefix + Instruction.b) && currentLine.contains(commandPrefix + Instruction.f)) {
                try
                {
                    treeMap.put(++key, TreeMaker.makeDoubleTree(currentLine, commandPrefix));

                }catch (NumberFormatException e) {
                    System.out.println("Something wrong with parsing, please try again later...");
                    key--;
                }

            }else if (currentLine.contains(commandPrefix + Instruction.b)) {
                treeMap.put(++key, TreeMaker.makeStringTree(currentLine, commandPrefix));
            }

            if (currentLine.contains(commandPrefix + Instruction.list)
                    && ((currentLine.contains(commandPrefix + Instruction.in) || currentLine.contains(commandPrefix + Instruction.pre) || currentLine.contains(commandPrefix + Instruction.post)))) {
                for (Map.Entry<Integer, BinaryTree> entry : treeMap.entrySet()) {
                    Integer key = entry.getKey();
                    BinaryTree binaryTree = entry.getValue();
                    if (currentLine.contains(commandPrefix + Instruction.in)) {
                        binaryTree.setTypeTravers(new inOrderTraver());
                    }else if (currentLine.contains(commandPrefix + Instruction.pre)) {
                        binaryTree.setTypeTravers(new preOrderTraver());
                    }else {
                        binaryTree.setTypeTravers(new postOrderTraver());
                    }
                    printTree(key, binaryTree);
                }

            }else if (currentLine.contains(commandPrefix + Instruction.list) && currentLine.contains(commandPrefix + Instruction.graph)) {
                for (Map.Entry<Integer, BinaryTree> entry : treeMap.entrySet()) {
                    Integer key = entry.getKey();
                    BinaryTree binaryTree = entry.getValue();
                    System.out.print(key + ". ");
                    GraphTreePrinter.printNode(binaryTree.root);
                    System.out.println();
                }
            }else if (currentLine.contains(commandPrefix + Instruction.list)) {
                for (Map.Entry<Integer, BinaryTree> entry : treeMap.entrySet()) {
                    Integer key = entry.getKey();
                    BinaryTree binaryTree = entry.getValue();
                    binaryTree.setTypeTravers(new defaultOrderTraver());
                    printTree(key, binaryTree);

                }

            }

            //Reading from file
            if (currentLine.contains(commandPrefix + Instruction.r)) {
                IOFile readerFromFile = new IOFile();
                List<String> linesFromFile;
                try
                {
                    linesFromFile = readerFromFile.readFromFile(currentLine, commandPrefix);
                    treeMap.put(++key, TreeMaker.makeStringTree(linesFromFile, commandPrefix));
                }
                catch (IOException e)
                {
                    System.out.println("File not find, please try again");
//                    e.printStackTrace();
                }

            }

        }

    }

    public static void printTree(Integer key, BinaryTree binaryTree) {
        System.out.print(key + ". ");
        binaryTree.getRevers(binaryTree.root, node -> System.out.print(" " + node.getData()));
        System.out.println();

    }

}
