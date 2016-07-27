package toporynskyi.goit.testProject;

/**
 * Created by grant on 7/21/16.
 */
public class Traverse {
    private static final StringBuilder result = new StringBuilder();
    public static void clearResult(){
        result.delete(0, result.length());
    }
    public static String inorderTraverse(Node current) {
        try {
            if (current == null)
                return null;
            inorderTraverse(current.getLeft());
            result.append(current.getValue()).append(" ");
            inorderTraverse(current.getRight());
        } catch (Exception e) {
            System.out.println("[Error:]" + e.getMessage());
        }
        return result.toString();
    }

    public static String preorderTraverse(Node current) {
        try {
            if (current == null)
                return null;
            result.append(current.getValue()).append(" ");
            preorderTraverse(current.getLeft());
            preorderTraverse(current.getRight());
        } catch (Exception e) {
            System.out.println("[Error:]" + e.getMessage());
        } return result.toString();
    }

    public static String postorderTraverse(Node current) {
        try {
            if (current == null)
                return null;
            postorderTraverse(current.getLeft());
            postorderTraverse(current.getRight());
            result.append(current.getValue()).append(" ");
        } catch (Exception e) {
            System.out.println("[Error:]" + e.getMessage());
        } return result.toString();
    }

}