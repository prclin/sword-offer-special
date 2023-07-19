package simple;

public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode tmp;
        ListNode nh=null;
        while (head!=null){
             tmp=head.next;
             head.next=nh;
             nh=head;
             head=tmp;
        }
        return nh;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
