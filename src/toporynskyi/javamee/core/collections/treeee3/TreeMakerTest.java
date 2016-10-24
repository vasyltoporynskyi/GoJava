package toporynskyi.javamee.core.collections.treeee3;

import toporynskyi.javamee.core.collections.treeee3.binarytree.BinaryTree;
import toporynskyi.javamee.core.collections.treeee3.ordertraver.inOrderTraver;
import toporynskyi.javamee.core.collections.treeee3.ordertraver.postOrderTraver;
import toporynskyi.javamee.core.collections.treeee3.ordertraver.preOrderTraver;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TreeMakerTest {
    private static BinaryTree<Double> workTestDouble = new BinaryTree<>();
    private static BinaryTree<Float> workTestFloat = new BinaryTree<>();
    private static BinaryTree<String> workTestString = new BinaryTree<>();

    private static String[] floatValues = {"21.4", "17.67", "11.56", "12.55"};
    private static String[] doubleValues = {"10.4", "99.67", "-1.56", "2.55", "2.54"};
    private static String[] stringValues = {"cxd", "mvr", "mva", "klm", "axe"};

    private static List<String> floatList = Arrays.asList(floatValues);
    private static List<String> doubleList = Arrays.asList(doubleValues);
    private static List<String> stringList = Arrays.asList(stringValues);

    private static String commandPrefix = "-";

    @Before
    public void setUp() throws Exception {
    }

    @Test(timeout = 1000)
    public void makeInOrderDoubleTree() throws Exception {
        List<Double> testArray = new ArrayList<>();
        testArray.add(-1.56);
        testArray.add(2.54);
        testArray.add(2.55);
        testArray.add(10.4);
        testArray.add(99.67);
        workTestDouble = TreeMaker.makeDoubleTree(doubleList, commandPrefix);
        workTestDouble.setTypeTravers(new inOrderTraver());
        ArrayList<Double> workArray = new ArrayList<>();
        workTestDouble.getRevers(workTestDouble.root, node -> workArray.add((double)node.getData()));
        assertEquals(testArray, workArray);
    }

    // Tests of double tree

    @Test(timeout = 1000)
    public void makePostOrderDoubleTree() throws Exception {
        List<Double> testArray = new ArrayList<>();
        testArray.add(2.54);
        testArray.add(2.55);
        testArray.add(-1.56);
        testArray.add(99.67);
        testArray.add(10.4);
        workTestDouble = TreeMaker.makeDoubleTree(doubleList, commandPrefix);
        workTestDouble.setTypeTravers(new postOrderTraver());
        ArrayList<Double> workArray = new ArrayList<>();
        workTestDouble.getRevers(workTestDouble.root, node -> workArray.add((double)node.getData()));
        assertEquals(testArray, workArray);
    }

    @Test(timeout = 1000)
    public void makePreOrderDoubleTree() throws Exception {
        List<Double> testArray = new ArrayList<>();
        testArray.add(10.4);
        testArray.add(-1.56);
        testArray.add(2.55);
        testArray.add(2.54);
        testArray.add(99.67);
        workTestDouble = TreeMaker.makeDoubleTree(doubleList, commandPrefix);
        workTestDouble.setTypeTravers(new preOrderTraver());
        ArrayList<Double> workArray = new ArrayList<>();
        workTestDouble.getRevers(workTestDouble.root, node -> workArray.add((double)node.getData()));
        assertEquals(testArray, workArray);
    }

    // Tests of float tree

    @Test(timeout = 1000)
    public void makeInOrderFloatTree() throws Exception {
        List<Float> testArray = new ArrayList<>();
        testArray.add(11.56f);
        testArray.add(12.55f);
        testArray.add(17.67f);
        testArray.add(21.4f);
        workTestFloat = TreeMaker.makeFloatTree(floatList, commandPrefix);
        workTestFloat.setTypeTravers(new inOrderTraver());
        ArrayList<Float> workArray = new ArrayList<>();
        workTestFloat.getRevers(workTestFloat.root, node -> workArray.add((float)node.getData()));
        assertEquals(testArray, workArray);
    }

    @Test(timeout = 1000)
    public void makePreOrderFloatTree() throws Exception {
        List<Float> testArray = new ArrayList<>();
        testArray.add(21.4f);
        testArray.add(17.67f);
        testArray.add(11.56f);
        testArray.add(12.55f);
        workTestFloat = TreeMaker.makeFloatTree(floatList, commandPrefix);
        workTestFloat.setTypeTravers(new preOrderTraver());
        ArrayList<Float> workArray = new ArrayList<>();
        workTestFloat.getRevers(workTestFloat.root, node -> workArray.add((float)node.getData()));
        assertEquals(testArray, workArray);
    }

    @Test(timeout = 1000)
    public void makePostOrderFloatTree() throws Exception {
        List<Float> testArray = new ArrayList<>();
        testArray.add(12.55f);
        testArray.add(11.56f);
        testArray.add(17.67f);
        testArray.add(21.4f);
        workTestFloat = TreeMaker.makeFloatTree(floatList, commandPrefix);
        workTestFloat.setTypeTravers(new postOrderTraver());
        ArrayList<Float> workArray = new ArrayList<>();
        workTestFloat.getRevers(workTestFloat.root, node -> workArray.add((float)node.getData()));
        assertEquals(testArray, workArray);
    }

    // Tests of String tree

    @Test(timeout = 1000)
    public void makeInOrderStringTree() throws Exception {
        List<String> testArray = new ArrayList<>();
        testArray.add("mvr");
        testArray.add("mva");
        testArray.add("klm");
        testArray.add("cxd");
        testArray.add("axe");
        workTestString = TreeMaker.makeStringTree(stringList, commandPrefix);
        workTestString.setTypeTravers(new inOrderTraver());
        ArrayList<String> workArray = new ArrayList<>();
        workTestString.getRevers(workTestString.root, node -> workArray.add((String)node.getData()));
        assertEquals(testArray, workArray);
    }

    @Test(timeout = 1000)
    public void makePreOrderStringTree() throws Exception {
        List<String> testArray = new ArrayList<>();
        testArray.add("cxd");
        testArray.add("mvr");
        testArray.add("mva");
        testArray.add("klm");
        testArray.add("axe");
        workTestString = TreeMaker.makeStringTree(stringList, commandPrefix);
        workTestString.setTypeTravers(new preOrderTraver());
        ArrayList<String> workArray = new ArrayList<>();
        workTestString.getRevers(workTestString.root, node -> workArray.add((String)node.getData()));
        assertEquals(testArray, workArray);
    }

    @Test(timeout = 1000)
    public void makePostOrderStringTree() throws Exception {
        List<String> testArray = new ArrayList<>();
        testArray.add("klm");
        testArray.add("mva");
        testArray.add("mvr");
        testArray.add("axe");
        testArray.add("cxd");
        workTestString = TreeMaker.makeStringTree(stringList, commandPrefix);
        workTestString.setTypeTravers(new postOrderTraver());
        ArrayList<String> workArray = new ArrayList<>();
        workTestString.getRevers(workTestString.root, node -> workArray.add((String)node.getData()));
        assertEquals(testArray, workArray);
    }

}