package mylinkedlist;

public class Delete {
    private Node head;
    public void Delete(){
    if(head == null){
        System.out.println("Không có gì để xóa hết");
    }
    Node temp = head;
    count = length();
    while(temp.next != null){
        temp.next = head;
        temp = null;
        count = count - 1;
    }
}
}