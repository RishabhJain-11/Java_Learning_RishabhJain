package com.javacompany.leetcodeassignment;

public class InsertionSortList {
    public static void main(String[] args) {

    }

      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode insertionSortList(ListNode head) {
        if (head == null){
            return head;
        }

        ListNode help = new ListNode(0);
        ListNode cur = head;
        ListNode pre = help;
        ListNode next = null;

        while (cur != null){
            next = cur.next;
            while (pre.next != null && pre.next.val < cur.val){
                pre = pre.next;
            }

            cur.next = pre.next;
            pre.next = cur;
            pre = help;
            cur = next;
        }
        return help.next;
    }
}

