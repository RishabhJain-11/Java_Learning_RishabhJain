package com.sololearnjava;

public class GettersandSetters {
    public static class Vehicle {
        private String color;

        // Getter
        public String getColor() {
            return color;
        }

        // Setter
        public void setColor(String c) {
            this.color = c;
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.setColor("Black");
        System.out.println("The color is "+v1.getColor());
    }
}
 /*
            Getters & Setters
            Getters and Setters are used to effectively protect your data, particularly when creating classes. For each variable, the get method returns its value, while the set method sets the value.

            Getters start with get, followed by the variable name, with the first letter of the variable name capitalized.
            Setters start with set, followed by the variable name, with the first letter of the variable name capitalized.

            //syntax

            public class Vehicle {
            private String color;

  // Getter
             public String getColor() {
             return color;
             }

 // Setter
            public void setColor(String c) {
            this.color = c;
            }
            }
             */



            /*
            The getter method returns the value of the attribute.
            The setter method takes a parameter and assigns it to the attribute.
            The keyword this is used to refer to the current object.
            Basically, this.color is the color attribute of the current object.
             */


