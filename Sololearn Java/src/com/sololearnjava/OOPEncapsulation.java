package com.sololearnjava;

public class OOPEncapsulation {
    /*
    There are 4 core concepts in OOP: encapsulation, inheritance, polymorphism, and abstraction.

    The idea behind encapsulation is to ensure that implementation details are not visible to users. The variables of one class will be hidden from the other classes, accessible only through the methods of the current class. This is called data hiding.
    To achieve encapsulation in Java, declare the class' variables as private and provide public setter and getter methods to modify and view the variables' values.
     */
    /*
    In summary, encapsulation provides the following benefits:
    - Control of the way data is accessed or modified
    - More flexible and easily changed code
    - Ability to change one part of the code without affecting other parts
     */




    //Inheritance
    /*


    Inheritance is the process that enables one class to acquire the properties (methods and variables) of another. With inheritance, the information is placed in a more manageable, hierarchical order.

    The class inheriting the properties of another is the subclass (also called derived class, or child class); the class whose properties are inherited is the superclass (base class, or parent class).

    To inherit from a class, use the extends keyword.
    This example shows how to have the class Dog to inherit from the class Animal.
     */

    static class Animal {
        protected int legs;
        public void eat() {
            System.out.println("Animal eats");
        }
    }

    static class Dog extends Animal {
        Dog() {
            legs = 4;
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }



}
