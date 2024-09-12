/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        HashMap<Node , Node> map = new HashMap<>();
        Node temp = head;
        while(temp != null){
            Node res = new Node(temp.val);
            map.put(temp , res);
            temp = temp.next;
        }
         temp = head;
         Node head_new = map.get(head);
        while(temp != null){
            Node temp2 = map.get(temp);
             temp2.next =  map.get(temp.next);
             temp2.random = map.get(temp.random);
             temp = temp.next;
        }
        return head_new;
    }
}