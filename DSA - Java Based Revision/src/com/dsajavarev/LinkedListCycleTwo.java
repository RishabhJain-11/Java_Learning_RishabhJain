package com.dsajavarev;

public class LinkedListCycleTwo {
    public static void main(String[] args) {

    }
    public static ListNode detectCycle(ListNode head){
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }

            if(fast == null || fast.next == null){
                return null;
            }
            while (head != slow) {
                head = head.next;
                slow = slow.next;
            }
        }
        return head;
    }
}
