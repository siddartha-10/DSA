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
/*
public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

 */


