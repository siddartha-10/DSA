package CircularLinkedList;

public class CLL {

    Node head;
    Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    // this method is used to insert
    public void insert(int val){
        Node node = new Node(val);
        if(tail==null){
            head = node;
            tail = node;
        }
        tail.next = node;
        tail = node;
        node.next = head;
    }

    // this method is used to display
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
