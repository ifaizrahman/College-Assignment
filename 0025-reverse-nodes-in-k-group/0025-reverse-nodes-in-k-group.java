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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;
        while (curr != null && count != k) { 
            curr = curr.next;
            count++;}


            if(count==k){
                ListNode reversedHead = reverse(head, k);
            
            
            head.next = reverseKGroup(curr, k);
            
            return reversedHead;
            }
            return head;
        } 

    static ListNode reverse(ListNode head,int k) {
                ListNode prev = null;
                ListNode curr = head;

                while (k-- > 0) {
                    ListNode temp = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = temp;
                }

                return prev;
}
}