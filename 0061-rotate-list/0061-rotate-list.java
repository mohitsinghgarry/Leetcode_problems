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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int length = 0;
        ListNode temp_new = head;
        while(temp_new!=null){
            length++;
            temp_new = temp_new.next;
        }
        int node = k%length;
        int pos = length - node;
        ListNode temp = head;
        if(node == 0) return head;
        if(length == 1 || k == 0) return head;
        while(pos > 1 && temp!=null){
            temp = temp.next;
            pos--;
        } 
        // System.out.print(temp.next.val);
        ListNode newhead = temp.next;
        temp.next = null;
        ListNode newtemp = newhead;
        while(newtemp.next != null){
            newtemp = newtemp.next;
        }
        newtemp.next = head;
        return newhead;
    }
}