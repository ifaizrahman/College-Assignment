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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        

        while(l1 != null || l2 != null || carry !=0){
           
           
            int s1 = (l1 != null) ? l1.val : 0;
            int s2 = (l2 != null) ? l2.val : 0;

            int sum=s1 + s2 + carry;
            carry=sum/10;
            ListNode newnode= new ListNode(sum%10);
            temp.next=newnode;
            temp=temp.next;
           
            if(l1 != null){
                l1=l1.next;
            }
            if(l2 != null){
                l2=l2.next;
            }
                
            

        }

        return dummy.next;
    }
}