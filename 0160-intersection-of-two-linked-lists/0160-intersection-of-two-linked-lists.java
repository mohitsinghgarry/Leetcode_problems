/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;   
        int length1 = length(headA);
        int length2 = length(headB);
        int diff = Math.abs(length1 - length2);
         if(diff > 0){
             if(length1 > length2) {
                while(diff-- >0){
                    temp1 = temp1.next;
                }
             }
             else {
                while(diff-- >0){
                    temp2 = temp2.next;
                }
             }
         }
         while(temp1 !=null){
            if(temp1 == temp2) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
         }
         return null;
    }
    public int length(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}