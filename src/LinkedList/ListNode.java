package LinkedList;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(){
        val=0;
        next=null;
    }

    public ListNode(int x){
        val=x;
        next=null;
    }

    public ListNode(int x,ListNode node){
        val=x;
        next=node;
    }
}
