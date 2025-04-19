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
    public boolean hasCycle(ListNode head) {
       /* ListNode slow=head;
        ListNode fast=head;

        if(head == null || head.next == null) return false;

        while(fast != null && fast.next !=null){
            
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false; */


        HashSet<ListNode> visited = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (visited.contains(current)) {
                return true;
            }
            visited.add(current);
            current = current.next;
        }
        return false;
    }
}