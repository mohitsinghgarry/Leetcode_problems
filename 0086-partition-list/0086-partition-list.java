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
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
        ListNode small = new ListNode();
        ListNode res = small;
        ListNode greater = new ListNode();
        ListNode res_new = greater;
        while(head!=null){
            if(head.val<x){small.next = head; small = small.next;}
            else {greater.next = head; greater = greater.next;}
            head = head.next;
        }
        greater.next = null;
        small.next = res_new.next;
        return res.next;
    }
}