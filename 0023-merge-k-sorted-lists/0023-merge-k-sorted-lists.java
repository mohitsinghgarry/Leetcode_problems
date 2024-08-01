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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp!=null){
                arr.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(arr);
      ListNode newnode = new ListNode(0); 
        ListNode temp_new = newnode;
        for(int i = 0;i<arr.size();i++){
              ListNode temp2 = new ListNode(arr.get(i));
            temp_new.next= temp2;
            temp2.next = null;
            temp_new = temp2;
        }
       ListNode head = newnode.next;
        return head;
    }
}