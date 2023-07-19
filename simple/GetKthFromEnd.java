package simple;

public class GetKthFromEnd {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode end=head;
        while (end!=null&&k>0){
            end=end.next;
            k--;
        }

        while (end!=null){
            head=head.next;
            end=end.next;
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
