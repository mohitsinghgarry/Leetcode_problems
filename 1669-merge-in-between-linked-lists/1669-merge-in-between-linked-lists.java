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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        //REMOVING THE NODE FROM A TO B
        ListNode start = find(list1 , a);
        ListNode end = find(list1 ,b);
        end = end.next;
        ListNode begin  = list2;
        ListNode finish = ending(list2);
        // System.out.print(finish.val);
        start.next = list2;
        finish.next = end.next;
        return list1;
      
    }
    public ListNode ending(ListNode list){
        ListNode temp = list;
        while(temp.next!=null){
            temp= temp.next;
        }
        return temp;
    }
    public ListNode find(ListNode list , int k){
        ListNode temp = list;
        while(k>1){
            temp = temp.next;
            k--;
        }
        return temp;
    }

}