package DoublyLinkedList;

public class LinkedList {

    Node head;

    // this method is used to insert an element at the first of the linkedlist
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    // this method is used to display the elements of an DoublyLinkedList
    public void display(){
        Node node = head;
        Node last = node;
        while(node!=null){
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("End");

        System.out.println("Print in reverse");

        while(last!=null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println();
    }
    private class Node{
         int value;
         Node next;
         Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
