package simple;

public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (true){
            if (root.val>p.val&&root.val>q.val) root=root.left;
            else if (root.val<p.val&&root.val<q.val) root=root.right;
            else {
                return root;
            }
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
