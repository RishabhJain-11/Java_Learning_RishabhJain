package com.sololearnjava;

public class InheritanceExample {

    static class A{
        public A(){
            System.out.println("New A");
        }

    }
    static class B extends A{
        public B(){
            System.out.println("New B");
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        /*
        You can access the superclass from the subclass using the super keyword.
        For example, super.var accesses the var member of the superclass.
         */
    }
}
/*
Polymorphism


Polymorphism, which refers to the idea of "having many forms", occurs when there is a hierarchy of classes related to each other through inheritance.
A call to a member method will cause a different implementation to be executed, depending on the type of the object invoking the method.
Here is an example: Dog and Cat are classes that inherit from the Animal class. Each class has its own implementation of the makeSound() method.
 */
