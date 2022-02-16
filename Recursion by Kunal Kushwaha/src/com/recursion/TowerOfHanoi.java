package com.recursion;
/*
Tower of Hanoi is a mathematical puzzle where we have three rods and n disks.
The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:

Only one disk can be moved at a time.
Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
No disk may be placed on top of a smaller disk.
 */
public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        toh(n,'1','2','3');
    }
    public static long toh(int N, int from, int to, int aux) {
        // Your code here
        if(N == 0){
            return 0;
        }
        long c1 = toh(N-1,from,aux,to);
        System.out.println("move disk "+ N +" from rod "+ from +" to rod "+ to);
        long c2  = toh(N-1,aux,to,from);
        return c1+c2+1;
    }
}
