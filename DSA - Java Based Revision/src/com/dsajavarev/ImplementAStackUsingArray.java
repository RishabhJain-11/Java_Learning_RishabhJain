package com.dsajavarev;

public class ImplementAStackUsingArray {
    static int top;
    static int[] arr = new int[1000];

    void MyStack()
    {
        top = -1;
    }

    public static void main(String[] args) {
        int arr[] = {};
    }
    public static void push(int a){
        top++;
        arr[top] = a;
    }

    public static int pop(){
        if(top < 0){
            return -1;
        }else{
            return arr[top--];
        }
    }
}

/*
class MyStack
{
    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}

	//Function to push an integer into the stack.
    void push(int a)
	{
	    // Your code here
	    top++;
	    arr[top] = a;

	}

    //Function to remove an item from top of the stack.
	int pop()
	{
        // Your code here
        if(top < 0){
            return -1;
        }
        else{
            return arr[top--];
        }
	}
}

 */