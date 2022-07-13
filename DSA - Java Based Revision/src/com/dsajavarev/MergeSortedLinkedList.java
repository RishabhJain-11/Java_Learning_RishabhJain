package com.dsajavarev;

import java.util.LinkedList;

public class MergeSortedLinkedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list2.add(1);
        list2.add(3);
        list2.add(4);
//        System.out.println(mergeTwoLists(list1,list2));
    }
    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode temp_node = new ListNode(0);
        ListNode curr_node = temp_node;

        while(l1 != null && l2 != null){
            if (l1.val < l2.val){
                curr_node.next = l1;
                l1 = l1.next;
            }else {
                curr_node.next = l2;
                l2 = l2.next;
            }
            curr_node = curr_node.next;
        }
        if(l1 != null){
            curr_node.next = l1;
            l1 = l1.next;
        }
        if(l2 != null){
            curr_node.next = l2;
            l2 = l2.next;
        }
        return temp_node.next;
    }
}
