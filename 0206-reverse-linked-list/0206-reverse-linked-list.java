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
    public ListNode reverseList(ListNode head) {
        // USING 3 POINTERS APPROACH
        if(head == null) return null;
       ListNode prev = null;
       ListNode curr = head;
       ListNode front = head;
       while(curr!=null){
        front = curr.next;
        curr.next = prev;
        prev = curr;
        curr = front;

       }
       return prev;

        
    }
}