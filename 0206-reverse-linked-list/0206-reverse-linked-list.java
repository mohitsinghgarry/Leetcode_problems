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
        // BRUTE FORCE APPROACH
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<>();
        arr(head ,arr);
        for(int i =arr.size()-1 ;i>=0;i--) res.add(arr.get(i));
        ListNode temp = arrayListToListNode(res);
        return temp;

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
    public void arr(ListNode head, ArrayList<Integer> arr){
        while(head!=null){
            arr.add(head.val);
            head= head.next;
        }
    }
}