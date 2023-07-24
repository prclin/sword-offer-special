package simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LowestCommonAncestor2 {

    TreeNode res=null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root,p,q);
        return res;
    }

    public boolean dfs(TreeNode root, TreeNode p, TreeNode q){
        if (root==null) return false;
        boolean lh=dfs(root.left,p,q);
        boolean rh=dfs(root.right,p,q);
        if ((lh&&rh)||((root.val == p.val || root.val == q.val) && (lh || rh))){
            res=root;
        }
        return lh||rh||(root.val == p.val || root.val == q.val);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
