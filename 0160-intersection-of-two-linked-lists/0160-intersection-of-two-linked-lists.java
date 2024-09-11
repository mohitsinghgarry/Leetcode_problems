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
        if(headA.next== null && headB.next == null && headA.val == headB.val) return headA;
        while(temp1!= null || temp2 != null){
            if(temp1 == temp2) return temp1;
            if(temp1.next == null && temp2.next != null) {temp1 = headB;temp2 = temp2.next;}
            else if(temp2.next == null && temp1.next != null) {temp2 = headA; temp1 = temp1.next;}
            else{
            temp1 = temp1.next;
            temp2 =temp2.next;
            }
        }
        return null;
    }
}