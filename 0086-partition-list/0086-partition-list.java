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
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
        ArrayList<Integer> arr = new ArrayList<>();
        smaller(head , arr,x);
        ListNode temp = head;
        while(temp!=null){
            if(temp.val>=x) arr.add(temp.val);
            temp = temp.next;
        }
        ListNode res =arrayListToListNode(arr);
        return res;
    }
    public void smaller(ListNode head , ArrayList<Integer>arr, int x){
        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x) arr.add(temp.val);
            temp = temp.next;
        }
    }
    public ListNode arrayListToListNode(ArrayList<Integer> arr) {
    if (arr.isEmpty()) return null;
    ListNode dummyNode = new ListNode(0);
    ListNode currentNode = dummyNode;
    for (int num : arr) {
        currentNode.next = new ListNode(num);
        currentNode = currentNode.next;
    }
    return dummyNode.next;
}
}