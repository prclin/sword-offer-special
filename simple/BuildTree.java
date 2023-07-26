package simple;

import java.util.HashMap;
import java.util.Map;

public class BuildTree {

    Map<Integer,Integer> map=new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return myBuildTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }

    public TreeNode myBuildTree(int[] preorder,int[] inorder,int preleft,int preright,int inleft,int inright){
        if (preleft>preright) return null;

        //构造根节点
        TreeNode root=new TreeNode(preorder[preleft]);
        //找到中序根节点位置
        int inrp=map.get(root.val);

        //左子树长度
        int ltLen=inrp-inleft;

        //构造根节点左子树
        root.left=myBuildTree(preorder,inorder,preleft+1,preleft+ltLen,inleft,inrp-1);
        //构造根节点右子树
        root.right=myBuildTree(preorder,inorder,preleft+ltLen+1,preright,inrp+1,inright);

        return root;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
