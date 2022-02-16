package com.recursion;

public class SumOfTwoNumbersUsingRecursion {
    public static void main(String[] args) {

        int x = 10;
        int y = 4;
        System.out.print("The Product of both the numbers = ");
        System.out.println(Product(x,y));
    }
    static int Product(int x , int y){
        if(x<y)
            return Product(y,x);
        else if (y!=0)
            return (x+Product(x,y-1));
        else
            return 0;
    }
}
