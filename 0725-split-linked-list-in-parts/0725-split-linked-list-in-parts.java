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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head; int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int parts = count/k;
        int extranode = count%k;
        ListNode[] result = new ListNode[k];
        ListNode current = head;
        for(int i = 0;i<k;i++){
            result[i] = current;
            int current_part_size = parts +( (i < extranode ) ? 1 : 0);
            for(int j = 1;j<current_part_size;j++){
                if(current != null) current = current.next;
            }
             if (current != null) {
                ListNode next = current.next;
                current.next = null;
                current = next;
            }
        }
        return result;
    }
}