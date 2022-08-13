package LinkedList;

public class SinglyLinkedList {
    public  ListNode head;

    public ListNode createLinkedList(int[] arr){
        int i=0;
        ListNode pointer = new ListNode();
        head=new ListNode();
        head.val=arr[i];
        head.next=null;
        pointer=head;
        i++;
        while(i<arr.length){
            ListNode node = new ListNode();
            node.val = arr[i];
            pointer.next=node;
            pointer = node;
            pointer.next=null;
            i++;
        }
        return head;
    }

    public void printLinkedList(){
        ListNode pointer = new ListNode();
        pointer = head;
        while(pointer!=null){
            System.out.println(pointer.val);
            pointer=pointer.next;
        }
    }

    public void insert(int value,int indx){
        int i=0;
        ListNode current = new ListNode();
        current=head;
        while(i<indx-1){
            current=current.next;
            i++;
        }
        ListNode newNode = new ListNode(value);
        newNode.next = current.next;
        current.next=newNode;
    }

    public int length(){
        int i=0;
        ListNode current = new ListNode();
        current=head;
        while(current!=null){
            i++;
            current=current.next;
        }
        return i;
    }

}
