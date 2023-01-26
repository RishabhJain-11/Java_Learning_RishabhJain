package com.dsajavarev;

public class SwapNodes {
    public static void main(String[] args) {

    }
    public ListNode swapPairs(ListNode head){
        if(head == null || head.next == null){
            return null;
        }
        ListNode secondNode = head.next;

        head.next = swapPairs(secondNode.next);
        secondNode.next = head;
        return secondNode;
    }
}
