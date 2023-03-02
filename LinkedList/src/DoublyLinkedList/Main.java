package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList dll = new LinkedList();
        dll.insertFirst(8);
        dll.insertLast(2);
        dll.insertLast(5);
        dll.insertLast(7);
        dll.display();
        dll.insert(5,18);
        dll.display();
    }
}
