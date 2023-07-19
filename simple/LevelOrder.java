package simple;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if (root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> el=new ArrayList<>();
            int qs= queue.size();
            for (int i=0;i<qs;i++){
                TreeNode poll = queue.poll();
                el.add(poll.val);
                if (poll.left!=null) queue.add(poll.left);
                if (poll.right!=null) queue.add(poll.right);
            }
            res.add(el);
        }
        return res;
    }



    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
