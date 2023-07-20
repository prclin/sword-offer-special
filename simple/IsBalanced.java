package simple;

public class IsBalanced {

    public boolean isBalanced(TreeNode root) {
        return dfs(root)>=0;
    }

    public int dfs(TreeNode root){
        if (root==null) return 0;
        int l = dfs(root.left);
        int r = dfs(root.right);
        if (l==-1||r==-1|| Math.abs(r-l)>1){
            return -1;
        }
        return Math.max(l,r)+1;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
