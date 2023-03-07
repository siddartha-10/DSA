package SinglyLinkedList;

public class LL {
    private ListNode head;
    private ListNode tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    // this is methods is used to insert the first element of the linkedList
    public void insertFirst(int val){
        // when ever you want to add something then we need to create a new node
        ListNode listNode = new ListNode(val);
        listNode.next = head; // we need to point to something else right hence we do next = head
        head = listNode; // actually the head is null but after inseting element one how head should point that [articular node

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
        ListNode listNode = new ListNode(val);
        tail.next = listNode;
        tail = listNode;
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
        ListNode temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        ListNode listNode = new ListNode(val,temp.next);
        temp.next = listNode;
        size = size + 1;
    }

    // this is insert method using recursion
    public void insertRec(int val,int index){
        head = insertRec(val,index,head);
    }
    private ListNode insertRec(int val, int index, ListNode listNode){
        if(index==0){
            ListNode temp = new ListNode(val, listNode);
            size = size + 1;
            return temp;
        }
        listNode.next = insertRec(val,index = index-1, listNode.next);
        return listNode;
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
        ListNode secondLast = get(size-2);
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
        ListNode prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size =size-1;
        return val;
    }

    // this method is used to get the node of the index to be deleted
    public ListNode get(int index){
        ListNode listNode = head;
        for (int i = 0; i < index; i++) {
            listNode = listNode.next;
        }
        return listNode;
    }

    // this method is used to find the element of the linkedList
    public int find(int value) {
        ListNode listNode = head;
        while (listNode != null) {
            if(listNode.value == value){
                return listNode.value;
            }
            listNode = listNode.next;
        }
        return 0;
    }

    // this method is used to display the linkedList
    public void display(){
        ListNode temp = head;
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
        ListNode listNode = head;
        while(listNode.next!=null){
            if(listNode.value== listNode.next.value){
                listNode.next = listNode.next.next;
                size--;
            }
            else{
                listNode = listNode.next;
            }
        }
        tail = listNode;
        tail.next = null;
    }

    // given 2 sorted linkedlist merge both of them
    // leetcode 21 merger two sorted linkedlist
    // https://leetcode.com/problems/merge-two-sorted-lists/
    public static LL merge(LL first,LL second){
        ListNode f = first.head;
        ListNode s = second.head;
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

    // sort linkedlist using bubble sort
    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            ListNode first = get(col);
            ListNode second = get(col + 1);

            if (first.value > second.value) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    ListNode prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    ListNode prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    // google amazon microsoft apple
    // reverse linked list givn=en only head
    // https://leetcode.com/problems/reverse-linked-list/
   /* public void reverse(Node head){
        if(size<2){
            return;
        }
        Node prev= null;
        Node present = head;
        Node next = present.next;
        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null){
                next = next.next;
            }
        }
        head = prev;
    }*/

    // this is the solution i submitted on leetcode.
    public ListNode reverseList(ListNode head) {
        if(head!=null){
            ListNode prev = null;
            ListNode present = head;
            ListNode next = present.next;
            while(present!=null){
                present.next = prev;
                prev = present;
                present = next;
                if(next!=null){
                    next = next.next;
                }
            }
            return prev;
        }
        return head;
    }

    // reverse a linked list given the left and the right element
    // https://leetcode.com/problems/reverse-linked-list-ii/description/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode prev = null;
        ListNode current  = head;

        for (int i = 0; current!=null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode newEnd = current;
        ListNode last = prev;
        ListNode next = current.next;
        for (int i = 0; current!=null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null){
                newEnd = next.next;
            }
        }

        if (last!=null){
            last.next = prev;
        }
        else{
            head = prev;
        }
        newEnd.next = current
        return head;
    }

    private class ListNode {
       private int value;
       private ListNode next;

       public ListNode(int value) {
           this.value = value;
       }

       public ListNode(int value, ListNode next) {
           this.value = value;
           this.next = next;
       }
    }

    public static void main(String[] args) {
//        LL first = new LL();
//        first.insertLast(1);
//        first.insertLast(3);
//        first.insertLast(5);
//        LL second = new LL();
//        second.insertLast(1);
//        second.insertLast(2);
//        second.insertLast(4);
//        second.insertLast(9);
//        second.insertLast(14);
//
//
//        LL ans = merge(first,second);
//        ans.display();
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
        LL l1 = new LL();
        for (int i = 3; i > 0; i--) {
            l1.insertLast(i);
        }
        l1.display();
        l1.bubbleSort();
        l1.display();

    }
}