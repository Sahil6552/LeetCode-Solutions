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
        
        // ListNode temp = head;
        // int ans = 1;
        // while(temp!=null){
        //     temp=temp.next;
        //     ans++;
        // }
        // temp=head;
        // for(int  i = 1;i<ans-n-1;i++){
        //     temp=temp.next;
        // }
        // if(n==1){
        //     temp.next=null;
        // }
        // else{
        //     temp.next = temp.next.next;
        // }
        // temp  = head;
        // return temp;
        
        if(head.next==null && n==1) return null;
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 0;i<n;i++){
            fast = fast.next;
        }
        if(fast == null) return head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}