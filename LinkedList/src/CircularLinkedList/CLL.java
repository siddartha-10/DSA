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
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    // this method is used to display
    public void display(){
        Node temp = head;
        if(temp!=null){
            do{
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }while (temp!=head);
        }
        System.out.println("Head");
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
