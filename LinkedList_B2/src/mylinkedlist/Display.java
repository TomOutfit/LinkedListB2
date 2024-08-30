package mylinkedlist;

public class Display {
    private Node head;
    public void Display(){
    Node currentNode = head;
    int i = 0;
    if(head == null){
        return;
    } //E đang nghĩ là nếu ko có node đầu tiên thì chắc linkedlist ko có node nào, nên check head ko có thì trả null luôn
    while(currentNode!=null){
        System.out.println(currentNode);
        currentNode = currentNode.next;
    }
    System.out.println();
}
}