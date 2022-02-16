package com.recursion;
//the most important video of this course
/*
if you dont know recursion
you will miss
1 binary tree
2 linked list
3 binary search trees
4 dynamic programming
5 heaps
6 graphs
7 traversals
8 90% of the course is dependent on this topic
PLEASE ----> WORK HARD ON RECURSION !!!!
 */
/*
YOU WILL FACE DIFFICULTIES LEARNING RECURSION
PLEASE DONT BE THAT A PERSON THAT QUITS IN BETWEEN WHILE LEARNING RECURSION

Q How to actually learn recursion
Prerequisites for recursion are -- Functions and Memory Management
 */
public class Message {

    public static void main(String[] args) {
	// write your code here that prints hello world
        message();
    }
    static void message(){
        System.out.println("Hello World ");
        message1();
    }
    static void message1(){
        System.out.println("Hello World ");
        message2();
    }
    static void message2(){
        System.out.println("Hello World ");
        message3();
    }
    static void message3(){
        System.out.println("Hello World ");
        message4();
    }
    static void message4(){
        System.out.println("Hello World ");
    }

}
/*
How to understand & approach a problem
1]Identify if you can break down problem into smaller problem
2]form the recurrence relation if needed
3]draw the recursive tree
4]About the tree
    *see the flow of function how they are getting in stack
    *identify and focus on left tree calls and right tree calls
    *draw the tree and pointers again and again using pen and paper
    *use a  debugger to see the flow
5]see how the value are returned at each step , see where the function call will come out of , in the end you will come out of the main function
6]do a lot of Q to get into recursion flow
 */












































































