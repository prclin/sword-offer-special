package simple;

public class MaxDepth {

    //结果
    int res=0;
    //当前层数
    int l=0;

    public int maxDepth(TreeNode root) {
        dfs(root);
        return res;
    }

    public void dfs(TreeNode root){
        if (root==null) {
            if (l>res) res=l;
            return;
        }
        l++;
        dfs(root.left);
        dfs(root.right);
        l--;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
