package simple;

import java.util.ArrayList;

public class ReversePrint {

    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        while (head!=null){
            al.add(head.val);
            head=head.next;
        }
        int size = al.size();
        int[] res=new int[size];
        for (int i = 0; i <size; i++) {
            res[i]=al.get(size-i-1);
        }
        return res;
    }


    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
