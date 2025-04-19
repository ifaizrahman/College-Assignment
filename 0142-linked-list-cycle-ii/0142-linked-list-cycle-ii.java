/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

       /* HashSet<ListNode> visited = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (visited.contains(current)) {
                return current;
            }
            visited.add(current);
            current = current.next;
        }
        return null; */

        ListNode slow=head;
        ListNode fast=head;

        if(head == null || head.next == null) return null;

        while(fast != null && fast.next !=null){
            
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                slow=head;
                while(slow != fast){
                   slow=slow.next;
                   fast=fast.next;
                        }
                return slow;
            }
       
        }
        return null;
    }
}