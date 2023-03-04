package Leetcode_sols;

import java.util.List;

public class MergeSortLL {

    public ListNode mergeSort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ListNode mid = middle(head);
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(mid);

        return merge(left,right);
    }

    public ListNode merge(ListNode first,ListNode second){
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while(first!=null && second!=null){
            if(first.val < second.val){
                tail.next = first;
                first = first.next;
                tail = tail.next;
            }
            else{
                tail.next = second;
                second = second.next;
                tail = tail.next;
            }
        }

        while(first!=null){
            tail.next = first;
            first = first.next;
            tail = tail.next;
        }

        while(second!=null){
            tail.next = second;
            second = second.next;
            tail = tail.next;
        }

        return dummy.next;
    }
    public ListNode middle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}


