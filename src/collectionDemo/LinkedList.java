package collectionDemo;

public class LinkedList {
    Node head;
    Node tail;
    void add(Object obj){
        Node node = new Node(obj);
        if(head==null){
            head=node;
            node.next = null;
        } else{
            Node temp = head;
            while (temp!=null){
                temp = temp.next;
            }
            node = temp;

        }
    }
}
