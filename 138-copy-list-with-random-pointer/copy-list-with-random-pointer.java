/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node deepcopy(Node head){
        Node dummy = new Node(0);
        Node temp = dummy;
        Node t1 = head;
        while(t1!=null){
            temp.next=new Node(t1.val);
            temp=temp.next;
            t1=t1.next;
        }
        return dummy.next;
    }
    public void  merge(Node head, Node deep){
        Node conn = new Node(0);
        Node t1 = head;
        Node t2 = deep;
        Node temp = conn;
        while(t1!=null && t2!=null){
            temp.next = t1;
            t1=t1.next;
            temp=temp.next;
            
            temp.next=t2;
            t2=t2.next;
            temp=temp.next;  
        }
    }
    public void randomConnection(Node head,  Node deep){
        Node t1 = head;
        Node t2 = deep;
        while(t1!=null && t2!=null){
            if(t1.random==null) t2.random=null;
            else{
                t2.random = t1.random.next;
            }
            t1=t1.next.next;
            if(t2.next!=null) t2=t2.next.next;
        }

    }
    public void split(Node  head){
         Node d1 = new Node(0);
        Node d2 = new Node(0);
        Node t1 = d1;
        Node t2 = d2;
        Node t = head;
        while(t!=null){
            t1.next=t;
            t1=t1.next;
            t=t.next;
            t2.next=t;
            t2=t2.next;
            t=t.next;
        }
        t1.next=null;
    }
    public Node copyRandomList(Node head) {
        Node deep = deepcopy(head);
        merge(head,deep);
        randomConnection(head,deep);
        split(head);
        return deep;
    }
}