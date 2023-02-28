package SinglyLinkedList;

import SinglyLinkedList.LL;

public class Main {
    public static void main(String[] args) {
        LL list= new LL();
        list.insertFirst(5);
        list.insertLast(25);
        list.insertLast(100);
        list.insertFirst(15);
        list.insert(20,2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(1));
        list.display();
    }
}
