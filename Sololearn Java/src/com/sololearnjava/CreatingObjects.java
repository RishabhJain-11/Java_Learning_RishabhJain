package com.sololearnjava;

public class CreatingObjects {

        public static void main(String[] args) {
//            Vehicle v1 = new Vehicle;
//            Vehicle v2 = new Vehicle;
//            v1.color = "red";
//            v2.horn();
            /*
            public is an access modifier, meaning that it is used to set the level of access. You can use access modifiers for classes, attributes, and methods.

            For classes, the available modifiers are public or default (left blank), as described below:
            public: The class is accessible by any other class.
            default: The class is accessible only by classes in the same package.

            The following choices are available for attributes and methods:
            default: A variable or method declared with no access control modifier is available to any other class in the same package.
            public: Accessible from any other class.
            protected: Provides the same access as the default access modifier, with the addition that subclasses can access protected methods and variables of the superclass (Subclasses and superclasses are covered in upcoming lessons).
            private: Accessible only within the declared class itself.
             */




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


        }
    }
