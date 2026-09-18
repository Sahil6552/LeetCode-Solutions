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
    public static int gcd(int a, int b) {
    while (b != 0) {
        int rem = a % b;
        a = b;
        b = rem;
    }
    return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null) return head;
        ListNode t1  = head;
        ListNode  t2 = head.next;
        while(t2!=null){
            int a = t1.val;
            int b = t2.val;
            int c = gcd(a,b);
            ListNode t3 = new ListNode(c);
            t1.next=t3;
            t3.next=t2;
            t1=t1.next.next;
            t2=t2.next;
        }
        return head;
    }
}