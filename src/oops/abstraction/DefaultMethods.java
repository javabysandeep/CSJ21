package oops.abstraction;

public class DefaultMethods {
    public static void main(String[] args) {
        CustomList array = new CustomArrayList();
        CustomList linkedList = new CustomLinkedList();

        array.search(null);
        linkedList.search(null);
    }
}
