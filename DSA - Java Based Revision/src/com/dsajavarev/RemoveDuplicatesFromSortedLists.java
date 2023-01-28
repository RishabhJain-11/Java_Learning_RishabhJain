package com.dsajavarev;

public class RemoveDuplicatesFromSortedLists {
    public static void main(String[] args) {

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
