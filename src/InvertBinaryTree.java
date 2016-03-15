import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode 226
 * Invert a binary tree.
 * From
 * 4
 * /   \
 * 2     7
 * / \   / \
 * 1   3 6   9
 * <p/>
 * To
 * 4
 * /   \
 * 7     2
 * / \   / \
 * 9   6 3   1
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        Queue queue = new LinkedList();
        int count = 1;
        TreeNode tmpNode = root;
        queue.add(tmpNode);
        while (!queue.isEmpty()) {
            tmpNode = (TreeNode) queue.remove();
            if (tmpNode == null) continue;
            TreeNode left = tmpNode.left;
            if (tmpNode.left != null) {
                queue.add(tmpNode.left);
            }
            TreeNode right = tmpNode.right;
            if (tmpNode.right != null) {
                queue.add(tmpNode.right);
            }
            tmpNode.left = right;
            tmpNode.right = left;
        }
        return root;
    }
}
