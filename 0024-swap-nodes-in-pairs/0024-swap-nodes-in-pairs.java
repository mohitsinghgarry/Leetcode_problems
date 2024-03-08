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
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null){
            int temp = fast.val;
            fast.val = slow.val;
            slow.val = temp;
            if(fast.next == null || fast.next.next ==null ) {
                break;
            }
            slow = fast.next;
            fast = fast.next.next;
            System.out.print(fast.val);
            System.out.print(slow.val);
        }
        return head;
    }
}