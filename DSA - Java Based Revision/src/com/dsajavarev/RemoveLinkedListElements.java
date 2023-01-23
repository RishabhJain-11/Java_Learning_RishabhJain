package com.dsajavarev;

public class RemoveLinkedListElements {
    public static void main(String[] args) {

    }
    public static ListNode removeElements(ListNode head, int val){
        if(head == null){
            return null;
        }
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null){
            if(fast.val == val){
                slow.next = fast.next;
                fast = slow.next;
            }
            else {
                slow = slow.next;
                fast = fast.next;
            }
        }
        if(head.val == val){
            head = head.next;
        }
        return head;
    }
}
