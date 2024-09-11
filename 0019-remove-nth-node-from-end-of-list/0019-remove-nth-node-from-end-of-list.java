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
       if(head == null) return null;
       ListNode temp = head;
       ListNode temp2 = head;
       int count = 0;
       while(temp!=null){
        count++;
        temp = temp.next;
       }
       int start = count - n +1;
       if(count == 1) return null;
       if(start == 1) head = head.next;
       while(start-- > 2) temp2 = temp2.next;
       if(temp2.next != null){
            if(temp2.next.next !=null){
                temp2.next =temp2.next.next;
            }
            else temp2.next = null;
       }
       return head;

    }
}