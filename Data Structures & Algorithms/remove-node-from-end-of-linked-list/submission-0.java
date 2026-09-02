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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> node=new ArrayList<>();
        ListNode dummy=head;
        while(dummy!=null){
            node.add(dummy);
            dummy=dummy.next;
        }
        int removeIndex=node.size()-n;
        if(removeIndex==0){return head.next;}
        node.get(removeIndex-1).next=node.get(removeIndex).next;
        return head;

    }
}
