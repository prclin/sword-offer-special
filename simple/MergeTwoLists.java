package simple;

import java.util.List;

public class MergeTwoLists {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode nHead=new ListNode(-1);
        ListNode current=nHead;
        while (l1!=null&&l2!=null){
            if (l1.val<=l2.val){
                current.next=l1;
                l1=l1.next;
            }else {
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }
        current.next=l1==null?l2:l1;
        return nHead.next;
    }

    public ListNode myMergeTwoLists(ListNode l1, ListNode l2){
        ListNode nHead=new ListNode(-1);
        ListNode current=nHead;
        while (true){
            if (l1==null) {
                current.next=l2;
                return nHead.next;
            }
            else if (l2==null) {
                current.next=l1;
                return nHead.next;
            }
            if (l1.val<=l2.val){
                current.next=l1;
                l1=l1.next;
            }else {
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
