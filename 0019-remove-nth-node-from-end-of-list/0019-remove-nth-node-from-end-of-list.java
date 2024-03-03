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
        int length = 0;
        ListNode temp = head;
        ListNode temp_new = head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int k = length- n+1;
        temp = head;
        if(length == 1) return null;
        if(k==1) head = head.next;
         while(k>1 && temp!=null){
            temp = temp.next;
            k--;
         }
        //  System.out.print(temp.val);
         temp = temp.next;
         k = length - n+1;
         while(k>2){
             temp_new = temp_new.next;
             k--;
         }
         temp_new.next = temp;
         return head;
    }
}