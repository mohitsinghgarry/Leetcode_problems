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
    public void reorderList(ListNode head) {
        // finding the middle one
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        prev.next = null;
        ListNode l1 = head;
        ListNode l2 = reverse(slow);
        find(l2);
        find(l1);
        merge(l1, l2);
    }
    public void find(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
      public ListNode reverse(ListNode head) {
        if (head == null) return null;
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode = null;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public void merge(ListNode l1 , ListNode l2){
        while(l2!=null){
            ListNode nxt = l1.next;
            l1.next = l2;
            l1 = l2;
            l2 = nxt;

        }
    }

}