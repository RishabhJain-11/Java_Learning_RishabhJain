package com.dsajavarev;
// https://practice.geeksforgeeks.org/problems/linked-list-insertion-1587115620/0/?page=1&difficulty[]=-1&status[]=unsolved&sortBy=submissions#
public class LinkedLinkInsertion {
    static class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
    public static void main(String[] args) {
//        int[] head = new int[]{9, 0, 5, 1, 6, 1, 2, 0, 5, 0};
//        int x = 5;
//        System.out.println();
    }
    static Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    //Function to insert a node at the end of the linked list.
    static Node insertAtEnd(Node head, int x)
    {
        // code here
        Node temp = new Node(x);

        if(head == null){
            return temp;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;

        return head;
    }
}
