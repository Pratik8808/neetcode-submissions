/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {


        if(head.next==null && n==1)
        {
            head=null;
            return head;
        }
        int i=0;
        ListNode temp=head;
        if(temp.next==null)
        {
            if(n==1)
            {
                temp=null;
            }
        }
        while(temp!=null)
        {
            temp=temp.next;
            i++;
        }
         if(i==n)
        {
            head=head.next;
            return head;
        }

        int travs=i-n;
        i=0;
        temp=head;
        while(i<travs-1)
        {
            temp=temp.next;
            i++;
        }
       

    
        

        temp.next=temp.next.next;
        



        return head;
    }
}
