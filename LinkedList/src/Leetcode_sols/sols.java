package Leetcode_sols;

/*
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode ans = new ListNode(); // creating a new linked list
        ListNode a = ans; // creating a tail for it so as to iterate through it.

        while(list1!=null && list2!=null){ // continuing the loop unitl either of the list 1 or list 2 muist be null.
            if(list1.val<list2.val){
                a.next = list1; // we are basically linking the new linkedlist to the element of the older linkedlist.
                list1 = list1.next; // going to the next node in the original firs LinkedListt
                a = a.next; // moving the tail pointer
            }
            else{
                a.next = list2;
                list2 = list2.next;
                a = a.next;
            }
        }

        while(list1!=null){ // this will either or run or not run based on the list1 pointer if it points to null or not
            a.next = list1;
            list1 = list1.next;
            a = a.next;

        }

        while(list2!=null){ // this will either or run or not run based on the list2 pointer if it points to null or not
            a.next = list2;
            list2 = list2.next;
            a = a.next;
        }

        return ans.next;
    }
}
*/