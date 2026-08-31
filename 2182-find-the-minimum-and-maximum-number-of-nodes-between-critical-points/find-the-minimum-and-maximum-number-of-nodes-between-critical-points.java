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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1,-1};
        int idx = 0, fidx=-1,lidx=-1,minDist=Integer.MAX_VALUE;
        ListNode  a = head;
        ListNode b = a.next;
        ListNode c = b.next;
        if(c==null) return ans;
        while(c!=null){
            if((b.val>a.val && b.val>c.val) ||( b.val<a.val && b.val<c.val)){
                if(fidx==-1){
                    fidx=idx;
                }
                if(lidx!=-1){
                    minDist=Math.min(minDist,idx-lidx);
                }
                lidx=idx;
            }
            idx++;
            a=a.next;
            b=b.next;
            c=c.next;  
        }
        int maxdist = lidx-fidx;
        if(maxdist==0) maxdist=-1;
        if(minDist==Integer.MAX_VALUE) minDist=-1;
        ans[0]=minDist;
        ans[1]=maxdist; 
        return ans;
    }
}