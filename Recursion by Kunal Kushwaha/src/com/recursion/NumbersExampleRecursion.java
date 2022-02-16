package com.recursion;
/*
Q. What is Recursion ?
A. A function that calls itself.
 */
public class NumbersExampleRecursion {
    public static void main(String[] args) {
        //print numbers that takes a number and prints it
        //print first 5 numbers = 1 2 3 4 5
        print(1);
    }

    static void print(int n){
        if(n==10){//base condition where our recursion will stop making new calls
            System.out.println(10);
            return;
        }
        System.out.println(n);
        //this is the last function and hence it is called tail recursion
        print(n+1);//recursive call
    }


}
/*
while the function is not finished executing it will remain in stack
as many times you call the function it will take memory separately
every call takes the same memory
one time will come when memory of computer will exceed then it will give stackoverflow error
 */
/*
 why recursion
 Answer
 function calling itself ,
 it helps us in solving bigger & complex problems in a simpler way
 you can convert the recursion solution and vice versa
 first solve complex problems using recursion and then try to solve it via iteration
 space complexity is not constant because of recursive calls
 it helps us in breaking down bigger problems into smaller problems

 visualizing recursion tree
1hr
1hr and 30mis
1hr
*/
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
 */
