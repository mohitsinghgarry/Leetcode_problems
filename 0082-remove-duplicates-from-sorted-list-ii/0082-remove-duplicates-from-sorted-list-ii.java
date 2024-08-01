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
    public ListNode deleteDuplicates(ListNode head) {
        //USING HASHSET AND LINKEDLIST
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            int num = temp.val;
           map.put(num , map.getOrDefault(num,0)+1);
           temp = temp.next;
        }
        for(Integer key : map.keySet()) {
            if(map.get(key)==1) arr.add(key);
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
        head = newnode.next;
        return head;

    }
}