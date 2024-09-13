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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums) set.add(num);
        ListNode temp2= head;
        while(temp2 !=null){
        if(set.contains(head.val)) head = head.next;
        temp2 = temp2.next;
        }
        ListNode temp = head;
        while(temp.next!=null){
            if(set.contains(temp.next.val)){
                if(temp.next.next!=null) temp.next = temp.next.next;
                else temp.next = null;
            }
            else temp = temp.next;
        }
        return head;
    }
}