import java.util.Stack;

/**
 * LeetCode 100
 * Given two binary trees, write a function to check if they are equal or not.
 *
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    if(!equalsNode(p, q)){
        return false;
    }
    Stack<TreeNode> stackP = new Stack<>();
    Stack<TreeNode> stackQ = new Stack<>();
    TreeNode pTmp = p;
    TreeNode qTmp = q;

    boolean result = true;
    while (pTmp != null || !stackP.isEmpty()) {
        if(!equalsNode(pTmp, qTmp)){
            return false;
        }
        if (pTmp != null) {
            stackP.push(pTmp);
            stackQ.push(qTmp);
            if(!equalsNode(pTmp, qTmp)){
                return false;
            }
            pTmp = pTmp.left;
            qTmp = qTmp.left;
        } else {
            pTmp = stackP.pop();
            qTmp = stackQ.pop();
            if(!equalsNode(pTmp, qTmp)){
                return false;
            }
            pTmp = pTmp.right;
            qTmp = qTmp.right;
        }
    }//while
    return result;
}

    private static boolean equalsNode(TreeNode p, TreeNode q) {
        if(p ==null&& q==null){
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return q.val == p.val;
    }
}
