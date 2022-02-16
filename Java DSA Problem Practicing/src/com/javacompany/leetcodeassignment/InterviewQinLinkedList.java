package com.javacompany.leetcodeassignment;

import java.util.List;

public class InterviewQinLinkedList {
    // https://leetcode.com/problems/linked-list-cycle
    // Amazon and Microsoft
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

    // find length of the cycle
    public static int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }


   public static ListNode detectCycle(ListNode head){

        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }
    if (length == 0){
        return null;
    }

    ListNode f  = head;
    ListNode s = head;

    while (length > 0){
        s = s.next;
        length--;
    }

    while (f != s){
        f = f.next;
        s = s.next;
    }
    return s;
    }

    public ListNode middleNode(ListNode head) {
        ListNode s  = head;
        ListNode f =  head;
        while (f != null && f.next != null){
            s = s.next;
            f = f.next;
        }
        return s;
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
}
