package com.dsajavarev;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(3, 0);
        head.next(2);
        head.next.next(0);
        head.next.next.next(-4);
        System.out.println(hasCycle(head));
    }
    public static boolean hasCycle(ListNode head){
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
