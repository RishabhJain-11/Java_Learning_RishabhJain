package com.javacompany.leetcodeassignment;


class Node{
    int data;
    Node next;

    Node(int data ,Node next){
        this.data = data;
        this.next = next;
    }
    Node(){}
}


public class CloneALinkedList {
    /*
    public static void main(String[] args) {
        int[] keys = {1,2,3,4};
        Node head = null;
        for (int i = keys.length-1;i >= 0 ; i--) {
            head = new Node(keys[i],head);
        }
        Node copy = copyList(head);
        printList(copy);
    }

    public static void printList(Node head){
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+" -> ");
            ptr = ptr.next;
        }
        System.out.println("Null");
    }

    public static Node copyList(Node head){
        Node current = head;
        Node newList = null;
        Node tail = null;

        while(current != null){
            if(newList == null){
                newList = new Node(current.data,null);
                tail = newList;
            }else {
                tail.next = new Node();
                tail = tail.next;
                tail.data = current.data;
                tail.next = null;
            }
            current = current.next;
        }
        return newList;
    }
 */
    public static void main(String[] args) {

    }
    public static void printList(Node head){
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+" -> ");
            ptr = ptr.next;
        }
        System.out.println("Null");
    }


}
