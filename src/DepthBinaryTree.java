import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode 104
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class DepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue queue = new LinkedList();
        int count = 1;
        int depth = 0;
        TreeNode tmpNode = root;
        queue.add(tmpNode);
        while (!queue.isEmpty()) {
            tmpNode = (TreeNode) queue.remove();
            count--;
            if (tmpNode.left != null) {
                queue.add(tmpNode.left);
            }
            if (tmpNode.right != null) {
                queue.add(tmpNode.right);
            }

            if (count == 0) {
                depth++;
                count = queue.size();
            }
        }
        return depth;
    }
}
