package com.dsajavarev;

public class CountNodesInLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int a){  data = a; next = null; }
    }
    public static void main(String[] args) {
//        Node head = 1->2->3->4->5;
//        System.out.println(getCount(head));
    }
    public static int getCount(Node head)
    { Node current=head;
        int count=0;
        while(current!=null){
            count=count+1;
            current=current.next;
        }
        //Code here
        return count;
    }
}
