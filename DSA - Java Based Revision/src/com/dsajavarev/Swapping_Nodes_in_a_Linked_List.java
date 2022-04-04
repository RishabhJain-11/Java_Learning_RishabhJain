package com.dsajavarev;
//  https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
public class Swapping_Nodes_in_a_Linked_List {
    public static void main(String[] args) {
//        ListNode{} head = {1,2,3,4,5};
        int k = 2;
    }
    public static ListNode swapNodes(ListNode head,int k){
        ListNode n1 = null,n2 = null;

        for (var p = head; p != null; p = p.next) {
            n2 = n2 == null ? null : n2.next;

            if (--k == 0){
                n1 = p;
                n2 = head;
            }
        }
        assert n1 != null;
        var tmp = n1.val;
        assert n2 != null;
        n1.val = n2.val;
        n2.val = tmp;
        return head;
    }
}
