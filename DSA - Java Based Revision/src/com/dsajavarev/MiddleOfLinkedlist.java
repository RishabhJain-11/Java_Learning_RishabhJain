package com.dsajavarev;

import java.util.Collections;
import java.util.LinkedList;

public class MiddleOfLinkedlist {
    public static void main(String[] args) {
//        ListNode head = new LinkedList<Integer>(Collections.singleton(1));
//        head.next(2);
//        head.next(3);
//        head.next(4);
////        head.add(5);
//        System.out.println(middleNode(head));
    }
    public static ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
