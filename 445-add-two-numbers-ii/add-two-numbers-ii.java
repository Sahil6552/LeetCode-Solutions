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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev =null ;
        ListNode forw = head;
        while(curr!=null){
            forw = forw.next;
            curr.next=prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode temp = ans;
        l1 = reverse(l1);
        l2 = reverse(l2);
        int carry = 0;
        ListNode t1 = l1;
        ListNode t2 = l2;
        while(t1!=null || t2!=null || carry!=0){
            int sum = carry;
            if(t1!=null){
                sum+=t1.val;
                t1 = t1.next;
            }
            if(t2!=null){
                sum+=t2.val;
                t2=t2.next;
            }
            int val = sum%10;
            ListNode na = new ListNode(val);
            temp.next = na;
            temp = temp.next;
            carry = sum/10;
        }
        ans.next=reverse(ans.next);
        return ans.next;
    }
}