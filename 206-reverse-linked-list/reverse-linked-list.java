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
        // ArrayList<ListNode> list = new ArrayList<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     list.add(temp);
        //     temp=temp.next;
        // }
        // int n = list.size();
        // ListNode d = new ListNode();
        // ListNode t1 = d;
        // for(int i = n-1;i>=0;i--){
        //     t1.next=list.get(i);
        //     t1=t1.next;
        // }
        // t1.next = null;
        // return d.next;
        ListNode curr=head;
        ListNode prev = null;
        ListNode forw = head;
        while(curr!=null){
            forw=curr.next;
            curr.next = prev;
            prev=curr;
            curr = forw;

        }
        return prev;
    }
}