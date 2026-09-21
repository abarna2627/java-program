class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode d= new ListNode(0);
        while(head != null){
            ListNode n=head.next;
            ListNode t=d;
            while(t.next != null && t.next.val <head.val)
t=t.next;
head.next=t.next;
t.next=head;
head=n;        
}
return d.next;
    }
}