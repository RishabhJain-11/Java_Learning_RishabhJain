package com.sololearnjava;

public class Variables {
    /*
    Variables have types. Some examples:
    - int: for integers (whole numbers) such as 123 and -456
    - double: for floating-point or real numbers with optional decimal points and fractional parts in fixed or scientific notations, such as 3.1416, -55.66.
    - String: for texts such as "Hello" or "Good Morning!". Text strings are enclosed within double quotes.
     */
    /*
    It is important to note that a variable is associated with a type, and is only capable of storing values of that particular type. For example, an int variable can store integer values, such as 123; but it cannot store real numbers, such as 12.34, or texts, such as "Hello".
     */
    public static void main(String[] args) {

    String name = "Rishabh";
    int num = 1234;
    double dob = 245.68;
    char ch = 'r';
    boolean bool = true;
        System.out.println(name+num+dob+ch+bool);
        /*
        char stands for character and holds a single character.

        Another type is the Boolean type, which has only two possible values: true and false.
        This data type is used for simple flags that track true/false conditions.
        You can use a comma-separated list to declare more than one variable of the specified type. Example: int a = 42, b = 11;
         */
    }
}
