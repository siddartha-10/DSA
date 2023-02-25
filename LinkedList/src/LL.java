public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    // this is methods is used to insert the first element of the linkedList
    public void insertFirst(int val){
        // when ever you want to add something then we need to create a new node
        Node node = new Node(val);
        node.next = head; // we need to point to something else right hence we do next = head
        head = node; // actually the head is null but after inseting element one how head should point that [articular node

        if(tail==null){
            tail = head; // if there is only one element in the linkedList then head and tail are the same
        }

        size = size + 1;
    }

    // this method is used to display the linkedList
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node{
       private int value;
       private Node next;

       public Node(int value) {
           this.value = value;
       }

       public Node(int value, Node next) {
           this.value = value;
           this.next = next;
       }
    }
}