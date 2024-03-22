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
    public boolean isPalindrome(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return true;
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        int len = length(head);
        int mid = 0;
        while(temp!=null && mid<len/2){
            stack.push(temp.val);
            mid++; temp=temp.next;
        }
        if(len%2!=0) temp = temp.next;
        while(temp!=null){
            if(temp.val != stack.pop()) return false;
            temp=temp.next;
        }
        return true;
    
    }
    public int length(ListNode head){
        ListNode temp = head;
        int count =0;
        while(temp!=null){count++; temp= temp.next;}
        return count;
    }
}