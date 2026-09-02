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
    public void reorderList(ListNode head) {
        List<ListNode> ans=new ArrayList<>();
        ListNode dum=head;
        while(dum!=null){
            ans.add(dum);
            dum=dum.next;
        }
        int l=0;
        int r=ans.size()-1;
        while(l<r){
            ans.get(l).next=ans.get(r);
            l++;
            if(l>=r){break;}
            ans.get(r).next=ans.get(l);
            r--;
        }
        ans.get(l).next=null;
        
    }
}
