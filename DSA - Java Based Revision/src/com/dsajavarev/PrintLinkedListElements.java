package com.dsajavarev;

public class PrintLinkedListElements {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static void main(String[] args) {
//        Node head = new int[]{49, 10, 30};
//        System.out.println(display(head));
    }
    public static void display(Node head)
    {
        //add code here.
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
