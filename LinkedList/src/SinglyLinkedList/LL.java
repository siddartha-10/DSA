package SinglyLinkedList;

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

    // this method is used to insert an element at the TAIL SIDE
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size = size + 1;
    }

    // this method is used to insert at any position of an array
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size = size + 1;
    }

    // this is insert method using recursion
    public void insertRec(int val,int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val,int index, Node node){
        if(index==0){
            Node temp = new Node(val, node);
            size = size + 1;
            return temp;
        }
        node.next = insertRec(val,index = index-1,node.next);
        return node;
    }

    // delete the first element
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size = size - 1; // do not forget to do this
        return val;
    }

    // this method is used to delete the second last element
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size = size - 1;
        return val;
    }

    // this method is used to delete at a particular index
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size =size-1;
        return val;
    }

    // this method is used to get the node of the index to be deleted
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // this method is used to find the element of the linkedList
    public int find(int value) {
        Node node = head;
        while (node != null) {
            if(node.value == value){
                return node.value;
            }
            node = node.next;
        }
        return 0;
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

    // questions
    // leetcode 83 remove duplicates from a sorted linked list
    // https://leetcode.com/problems/remove-duplicates-from-sorted-list/
    public void duplicates(){
        Node node = head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // given 2 sorted linkedlist merge both of them
    // leetcode 21 merger two sorted linkedlist
    // https://leetcode.com/problems/merge-two-sorted-lists/
    public static LL merge(LL first,LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f!=null && s!=null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }
            else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while(f!=null){
            ans.insertLast(f.value);
            f = f.next;
        }

        while(s!=null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
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

    public static void main(String[] args) {
        LL first = new LL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        LL second = new LL();
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(4);
        second.insertLast(9);
        second.insertLast(14);


        LL ans = merge(first,second);
        ans.display();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(4);
//        list.insertLast(4);
//        list.insertLast(4);
//
//        list.display();
//        list.duplicates();
//        list.display();
    }
}