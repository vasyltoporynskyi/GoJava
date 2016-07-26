package toporynskyi.goit.FinalProject;

import java.util.function.Consumer;

/**
 * Created by grant on 7/26/16.
 */
public class TreeTraverse {
    public static void preOrderTraver(Node root, Consumer<Node> callback) {
        if (root == null) {
            return;
        }
        callback.accept(root);
        preOrderTraver(root.getLeftChildren(), callback);
        preOrderTraver(root.getRightChildren(), callback);

    }

    public static void inOrderTraver(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraver(root.getLeftChildren());
        System.out.print(root.getData() + " ");
        inOrderTraver(root.getRightChildren());

    }

    public static void postOrderTraver(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraver(root.getLeftChildren());
        postOrderTraver(root.getRightChildren());
        System.out.print(root.getData() + " ");

    }
}
