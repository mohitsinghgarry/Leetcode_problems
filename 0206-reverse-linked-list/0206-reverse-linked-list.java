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
    public ListNode reverseList(ListNode head) {
        // BRUTE FORCE APPROACH USING ARRAYLIST
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
       Collections.sort(arr, Collections.reverseOrder());
            ListNode temp_new = new ListNode();
        if(arr.size()!= 0) temp_new.val = arr.get(0);
        else return null;
        ListNode temp_2 = temp_new;
        for(int i =1 ;i<arr.size();i++){
                ListNode temp_final = new ListNode(arr.get(i));
                temp_new.next = temp_final;
                temp_new = temp_final;
        }
        head = temp_2;
        return head;
    }
}