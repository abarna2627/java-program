class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode pn=dummy;
        for(int i=1;i<left;i++){
            pn=pn.next;
        }
        ListNode cn=pn.next;
        for(int i=0;i<right-left;i++){
ListNode nn=cn.next;
cn.next=nn.next;
nn.next=pn.next;
pn.next=nn;
        }
        return dummy.next;
        }
    }
