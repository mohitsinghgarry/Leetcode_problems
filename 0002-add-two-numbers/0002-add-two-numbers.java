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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        addition(l1,arr1);
        addition(l2,arr2);
        finalArraylist(arr1, arr2 ,result);
        if(result.size() ==0) return new ListNode(0);
         ListNode head =arrayListToListNode(result);
        return head;
    }
    public void finalArraylist(ArrayList<Integer> arr1 , ArrayList<Integer>arr2 , ArrayList<Integer> result){
        int i = 0;
        int j = 0;
        int carry = 0;
        while(i<arr1.size() || j<arr2.size() || carry!=0){
            int x = 0 ,  y = 0 ;
            if(i<arr1.size()) x = arr1.get(i);
            if(j<arr2.size()) y = arr2.get(i);
            int sum  = x+y+carry;
            result.add(sum%10);
            carry = sum/10;
            i++ ; j++;
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
    public void addition(ListNode root,ArrayList<Integer> arr){
        ListNode temp = root;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
    }
}