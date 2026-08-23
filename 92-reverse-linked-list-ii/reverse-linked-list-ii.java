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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
        }
        int i = left-1;
        int j = right-1;
        while(i<j){
            ListNode t1 = list.get(i);;
            ListNode t2 = list.get(j);
            list.set(i,t2);
            list.set(j,t1);
            i++;
            j--;
        }
        
        for(int k = 0;k<list.size();k++){
            if(k==list.size()-1){
               list.get(k).next=null;
            }
            else{
                list.get(k).next=list.get(k+1);
            }
        }
        return list.get(0);
    }
}