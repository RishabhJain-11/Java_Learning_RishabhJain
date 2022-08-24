package com.dsajavarev;

public class Recursion1 {
    public static void main(String[] args) {

    }
    /*
class Main {
	public static void main(String args[]) {
		//Print name 5 times
		// String name = "Rishabh";
		int n = 5;
		fun(1, n);
	}

	public static void fun(int i, int n){
		if(i > n){
			return;
		}
		System.out.println("Rishabh");
		fun(i + 1, n);
	}
}
*/
/*
class Main {
	public static void main(String args[]){
		int n  = 6;
		func(1, n);
	}
	public static void func(int i, int n ){
		if(i > n)
			return;

		System.out.println(i);
		func(i + 1, n);
	}
}*/
/*
class Main{
	public static void main(String args[]){
		int n = 6;
		func(n, n);
	}
	public static void func(int i, int n){
		if(i < 1)
			return;

		System.out.println(i);
		func(i - 1, n);
	}
}
*/
/*
class Main {
	public static void main(String args[]){
		int n  = 6;
		func(n, n);
	}
	public static void func(int i, int n){
		if(i < 1)
			return;

		func(i - 1, n);
		System.out.println(i);
	}
}
*/
/*
    class Main {
        public static void main(String args[]){
            int n  = 6;
            func(1, n);
        }
        public static void func(int i, int n){
            if(i > n)
                return;

            func(i + 1, n);
            System.out.println(i);
        }
    }
    */
}
