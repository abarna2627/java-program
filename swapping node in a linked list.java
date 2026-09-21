class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode a= head,b=head,temp=head;
        for(int i=1;i<k;i++)
        a=a.next;
     for(int i=0;i<k;i++)
        temp=temp.next;
        while(temp != null){
            temp=temp.next;
            b=b.next;
        }
     
        int x=a.val;
        a.val=b.val;
        b.val=x;
        return head;
        }
    
}