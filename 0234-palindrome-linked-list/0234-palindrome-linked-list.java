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
    public boolean isPalindrome(ListNode head) {
       /* ArrayList<Integer> arr= new ArrayList<>();
        ListNode curr=head;
        while(curr !=null){
            arr.add(curr.val);
            curr=curr.next;
        }
        
        for(int i=0; i<(arr.size()/2) ; i++){
            if (arr.get(i) != arr.get(arr.size() - 1 - i)){
                return false;
            }
            
        }return true; */

            ListNode slow = middle(head);
            ListNode head2 = slow.next;
            slow.next = null;

            head2 = reverse(head2);

            ListNode c1 = head;
            ListNode c2 = head2;
            while (c1 != null && c2 != null) {
                if (c1.val != c2.val)
                    return false;

                c1 = c1.next;
                c2 = c2.next;
            }

            return true;
            }

            static ListNode middle(ListNode head) {
                ListNode fast = head;
                ListNode slow = head;

                while (fast.next != null && fast.next.next != null) {
                    fast = fast.next.next;
                    slow = slow.next;
                }

                return slow;
            }

            static ListNode reverse(ListNode head) {
                ListNode prev = null;
                ListNode curr = head;

                while (curr != null) {
                    ListNode temp = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = temp;
                }

                return prev;
}


    }
