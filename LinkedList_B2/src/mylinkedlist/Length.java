package mylinkedlist;

public class Length {
    private Node head;
    public int length();
    int count = 0;
    Node currentNode = head;
    while (currentNode != null) {
        currentNode = currentNode.next;
        count++;
    }
    return count;
}
