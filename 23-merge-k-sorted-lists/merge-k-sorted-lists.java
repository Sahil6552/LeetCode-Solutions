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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode> list  = new ArrayList<>();
        
        for(ListNode n:lists){
            list.add(n);
        }
        if(list.size()==0) return null;
        while(list.size()>1){
            ListNode a = list.get(list.size()-1);
            list.remove(list.size()-1);
            ListNode b = list.get(list.size()-1);
            list.remove(list.size()-1);
            ListNode c = merge(a,b);
            list.add(c);
        }
        return list.get(0);
    } 
    public ListNode merge(ListNode a, ListNode b){
        ListNode t1 = a;
        ListNode t2 = b;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                temp.next = t1;
                t1=t1.next;
                temp = temp.next;
            }
            else{
                temp.next=t2;
                t2=t2.next;
                temp=temp.next;
            }
        }
        while(t1!=null){
            temp.next=t1;
            t1=t1.next;
            temp=temp.next;
        }
        while(t2!=null){
            temp.next=t2;
            t2=t2.next;
            temp=temp.next;
        }
        return dummy.next;
    }
}