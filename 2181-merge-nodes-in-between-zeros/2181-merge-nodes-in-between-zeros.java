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
        ListNode temp = head;
        ListNode temp_new = head;
        while(temp!=null && temp_new.next !=null){
            temp_new = temp_new.next;
            temp.val += temp_new.val;
            System.out.print(temp.val);
            if(temp_new.val == 0 && temp_new.next!=null){
                temp.next = temp_new;
                temp = temp_new;
            }
            if(temp_new.val == 0 && temp_new.next == null) temp.next = null;
        }
        return head;
    }
}