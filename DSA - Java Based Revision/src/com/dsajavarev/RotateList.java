package com.dsajavarev;

public class RotateList {
    public static void main(String[] args) {

    }
    public static ListNode rotateRight(ListNode head, int n){
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;

        int i;
        for(i = 0;fast.next != null;i++)
            fast = fast.next;

        for(int j = i - n % i;j > 0;j--)
            slow = slow.next;

        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;

        return dummy.next;
    }
}
