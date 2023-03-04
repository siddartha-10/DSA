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


/*
* https://leetcode.com/problems/linked-list-cycle/
*
* LinkedListCycle
* public class solution{
    public boolean hasCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
*
* */

import java.util.List;

// this is the 2pointer method whenever the questions ask's about a cycle then we need to use this.
public class sols {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow){
                int length = 0;
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    length++;
                }while (temp!=slow);
                return length;
            }
        }
        return 0;
    }


    // this is to find the start point of the cycle in a linkedlist
    // https://leetcode.com/problems/linked-list-cycle-ii/description/
    public ListNode detectcycle_startpoint(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        int length=0;
        // this code is to find the cycle
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                length = lengthCycle(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        while(length > 0){
            second = second.next;
            length--;
        }
        // now we just need to move the first and second pointer forward until they meet each other.
        while(first!=second){
            first = first.next;
            second = second.next;
        }
        return second;
    }

    // this code is asked in google interview and is very important
    // https://leetcode.com/problems/happy-number/
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = squares(slow);
            fast = squares(squares(fast));
        }while(slow!=fast);

        if(slow==1){
            return true;
        }
        return false;
    }

    public int squares(int num){
        int ans = 0;
        while(num>0){
            int rem = num%10;
            ans = ans + (rem*rem);
            num/=10;
        }
        return ans;
    }

    // this is the code to find the middle element of a linkedList in a single pass.
    // https://leetcode.com/problems/middle-of-the-linked-list/description/
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int x) {
        val = x;
        next = null;
    }
}
