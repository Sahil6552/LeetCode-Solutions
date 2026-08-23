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
    public ListNode reverseBetween(ListNode head, int l, int r) {
        // ArrayList<ListNode> list = new ArrayList<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     list.add(temp);
        //     temp=temp.next;
        // }
        // int i = left-1;
        // int j = right-1;
        // while(i<j){
        //     ListNode t1 = list.get(i);;
        //     ListNode t2 = list.get(j);
        //     list.set(i,t2);
        //     list.set(j,t1);
        //     i++;
        //     j--;
        // }
        
        // for(int k = 0;k<list.size();k++){
        //     if(k==list.size()-1){
        //        list.get(k).next=null;
        //     }
        //     else{
        //         list.get(k).next=list.get(k+1);
        //     }
        // }
        // return list.get(0);
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
         dummy.next=head;
        for(int i = 0;i<l-1;i++){
            temp = temp.next;
        }
        ListNode tail1 = temp;
        ListNode head1 = temp.next;
        for(int i = l;i<=r;i++){
            temp=temp.next;
        }
        ListNode tail2 = temp;
        ListNode head2 = temp.next;
        tail1.next=null;
        tail2.next=null;
        ListNode newhead = reverse(head1);
        tail1.next = newhead;
        head1.next=head2;
        return dummy.next;

    }
    public static ListNode reverse(ListNode head1){
        ListNode curr = head1;
        ListNode forw = head1;
        ListNode prev = null;
        while(curr!=null){
            forw = forw.next;
            curr.next=prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
}