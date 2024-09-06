package mylinkedlist;

public class Sort {
    private Node head;
    public void Sort(){
        if(head == null || head.next == null){
            System.out.println("Không thể tráo đổi");
        }
        Node currentNode = head;
        int i = 0;
        while (currentNode.next != null){
            if(currentNode.getData() > currentNode.next.getData()){
                int temp = currentNode.getData();
                currentNode.getData() = currentNode.next.getData();
                temp = currentNode.next.getData();
            }
        }
    }
}
