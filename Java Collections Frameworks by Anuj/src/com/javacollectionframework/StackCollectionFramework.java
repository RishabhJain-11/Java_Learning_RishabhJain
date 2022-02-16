package com.javacollectionframework;

import java.util.Stack;

public class StackCollectionFramework {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Cheetah");
        animals.push("Jaguar");
        animals.push("Leopard");
        System.out.println("Stack of apex predators = "+animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals);
        System.out.println(animals.peek());
        System.out.println(animals);
    }
}
