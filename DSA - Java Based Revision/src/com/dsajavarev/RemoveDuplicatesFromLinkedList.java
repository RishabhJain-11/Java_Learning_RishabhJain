package com.dsajavarev;

import java.util.LinkedList;

public class RemoveDuplicatesFromLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> head = new LinkedList<Integer>();
        head.add(1);
        head.add(1);
        head.add(2);
//        System.out.println(deleteDuplicates(head));
    }
    public static ListNode deleteDuplicates(ListNode head){
        ListNode list = head;
        while(list != null){
            if(list.next == null){
                break;
            }
            if(list.val == list.next.val){
                list.next = list.next.next;
            }else{
                list = list.next;
            }
        }
        return head;
    }
}
