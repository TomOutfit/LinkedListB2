package mylinkedlist;

public class DeleteFirst {
    private Node head;
    public void deleteFirst(int data){
        if(head == null){
            return;
        }
        Node NewFirstNode = head;
        head = head.next;
        NewFirstNode = null;
}
}