package simple;

public class MirrorTree {

    public TreeNode mirrorTree(TreeNode root) {
        if (root==null) return null;
        TreeNode left=mirrorTree(root.left);
        TreeNode right=mirrorTree(root.right);
        root.left=right;
        root.right=left;
        return root;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
