package simple;

public class DeleteNode {

    public ListNode deleteNode(ListNode head, int val) {
        if (head.val==val) return head.next;
        ListNode pre=head;
        ListNode current=head.next;
        while (current!=null){
            if (current.val==val) {
                pre.next=current.next;
                return head;
            }
            pre=current;
            current=current.next;
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
