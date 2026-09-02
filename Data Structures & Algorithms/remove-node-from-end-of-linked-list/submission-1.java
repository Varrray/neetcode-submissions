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
        ListNode dum=head;
        List<ListNode> ans=new ArrayList<>();
        while(dum!=null){
            ans.add(dum);
            dum=dum.next;
        }
        int removeIndex=ans.size()-n;
        if(removeIndex==0){return head.next;}
        ans.get(removeIndex-1).next=ans.get(removeIndex).next;
        return head;

    }
}
