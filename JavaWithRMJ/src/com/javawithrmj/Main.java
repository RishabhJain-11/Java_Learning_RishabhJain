package com.javawithrmj;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int top = -1;


    public static void main(String[] args) {

        int[] stack = new int[3];
        push(stack , 5 , 3 ) ;

        System.out.println("Current size of stack is" + size());

        push(stack , 10 , 3);
        push (stack , 24 , 3) ;

        System.out.println("Current size of stack is" + size());
        push(stack , 12 , 3) ;
//The current top element in stack is
        System.out.println("The current top element in stack is"+ top);

        for(int i = 0 ; i < 3;i++ )
            pop(i);
        System.out.println("Current size of stack is" + size());
        

    }

    static void push(int[] stack, int x , int n){

        if (top == x){
            System.out.println("Stack Overflow Condition !");
        }
        else {
            top = top + 1;
            stack[top] = x;
        }
    }

    static void pop(int x){
        if (isEmpty()){
            System.out.println("The Stack is Empty !");
        }else {
            top = top - 1;
        }
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static int size(){
        return top + 1;
    }

}
/*

int main( )
{
    int stack[ 3 ];
    push(stack , 5 , 3 ) ;

    cout << “Current size of stack is ” << size ( ) << endl ;

    push(stack , 10 , 3);
    push (stack , 24 , 3) ;

    cout << “Current size of stack is ” << size( ) << endl ;
    push(stack , 12 , 3) ;

    cout << ”The current top element in stack is “ << topElement( ) << endl;

    for(int i = 0 ; i < 3;i++ )
        pop( );
    cout << “Current size of stack is ” << size( ) << endl ;
    pop ( );

}
 */