package simple;

public class KthLargest {

    int res;
    int k;
    public int kthLargest(TreeNode root, int k) {
        this.k=k;
        dfs(root);
        return res;
    }

    public void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.right);
        if (k==0) return;
        if (--k==0) res=root.val;
        dfs(root.left);
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
