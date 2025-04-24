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
    public ListNode mergeNodes(ListNode head) {
        ListNode current=head;
        ListNode dummy= new ListNode(0);
        ListNode temp=dummy;
        int sum=0;

        while(current !=null){

            
            sum += current.val;
            current=current.next;

            if(current.val==0){
            ListNode newnode=new ListNode(sum);
            temp.next=newnode;
            temp=temp.next;

            current=current.next;
            sum=0;
            }
        }
        return dummy.next;
    }
}