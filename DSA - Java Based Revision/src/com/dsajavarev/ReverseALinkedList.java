package com.dsajavarev;

import java.util.List;

public class ReverseALinkedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {
//
    }
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null)
            return head;

        ListNode root = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return root;
    }
}
