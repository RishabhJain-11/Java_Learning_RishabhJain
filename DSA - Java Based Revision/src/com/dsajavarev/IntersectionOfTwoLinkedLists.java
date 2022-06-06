package com.dsajavarev;

public class IntersectionOfTwoLinkedLists {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public static void main(String[] args) {
//       intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
    }
    public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
        int lenA = length(headA),lenB = length(headB);
        while(lenA > lenB){
            headA = headA.next;
            lenA--;
        }
        while(lenA < lenB){
            headB = headB.next;
            lenB--;
        }
        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    private static int length(ListNode node){
        int length = 0;
        while(node != null){
            node = node.next;
            length++;
        }
        return length;
    }
}
