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
//        CountNodesInLinkedList head = new CountNodesInLinkedList();
//        head.()
//        System.out.println(reverseList(head));
    }
//    public ListNode reverseList(ListNode head){
//        if(head == null || head.next == null)
//            return head;
//
//        ListNode root = reverseList(head.next);
//
//        head.next.next = head;
//        head.next = null;
//        return root;
//    }
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
