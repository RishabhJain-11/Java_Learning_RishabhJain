package com.sololearnjava;

public class Polymorphism {
    static class Animal{
        public void makeSound(){
            System.out.println("Grr....");
        }
    }
    static class Dog extends Animal{
        public void makeSound(){
            System.out.println("Woof");
        }
    }
    static class Cat extends Animal{
        public void makeSound(){
            System.out.println("meow");
        }



    }

    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();

        a.makeSound();
        b.makeSound();
   }
}







