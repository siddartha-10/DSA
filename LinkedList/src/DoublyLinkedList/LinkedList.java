package DoublyLinkedList;

import SinglyLinkedList.LL;

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

    // this method is used insert element at the last position without using the tail
    public void insertLast(int val){
        Node node = new Node(val);
        if(head==null){
            // if the head is null that means linkedlist is empty head = node; head.prev = null;
            insertFirst(val);
            return;
        }
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        node.prev = last;
        last.next = node;
        node.next = null;
    }

    // this method is used to insert after a particular number
    // here after_val is what what value u will insert and val is what value you want to insert
    public void insert(int after_val,int val){
        Node p = find(after_val);
        if (p==null){
            System.out.println("Node Doesn't exist");
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null){
            node.next.prev = node;
        }
    }

    // this is used to find the node of the particular index
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // this method is used to display the elements of an DoublyLinkedList
    public void display(){
        Node node = head;
        Node last = node;
        System.out.println("Print in the original order");
        while(node!=null){
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("End");

//        System.out.println("Print in reverse");
//
//        while(last!=null){
//            System.out.print(last.value + " -> ");
//            last = last.prev;
//        }
//        System.out.println("Start");
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
