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
       //USING STACK
       Stack<Integer> stack = new Stack<>();
       ListNode temp = head;
       ListNode temp2 = head;
       while(temp!= null){
        stack.push(temp.val);
        temp = temp.next;
       }
       while(temp2 != null){
          if(stack.pop() != temp2.val) return false;
          temp2= temp2.next;
       }
       return true;
    }
}