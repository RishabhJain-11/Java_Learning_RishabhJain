package com.practice;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.println("Height");
//        int h = in.nextInt();
//
//        System.out.println("Radius");
//        int r = in.nextInt();
//
//        int vol_cone = (int) (3.14*h*r*r/3);
//        System.out.println("Vol of Cone : "+vol_cone);



//        System.out.println(" Base Height");
//        int h = in.nextInt();
//
//        System.out.println("Radius");
//        int b = in.nextInt();
//
//        int vol_prism = (int) (b*h);
//        System.out.println("Vol of prism : "+vol_prism);
//


//
//        System.out.println(" Base Height");
//        int h = in.nextInt();
//
//        System.out.println("Radius");
//        int r = in.nextInt();
//
//        int vol_cylinder = (int) (3.14*r*r*h);
//        System.out.println("Vol of cylinder : "+vol_cylinder);



//
//        System.out.println(" Base Height");
//        int h = in.nextInt();/
//
//        System.out.println("Radius");
//        int r = in.nextInt();
//
//        int vol_sphere = (int) (4*3.14*r*r*r/3);
//        System.out.println("Vol of sphere : "+vol_sphere);



        System.out.println(" Base Height");
        int h = in.nextInt();

        System.out.println("width");
        int w = in.nextInt();


        System.out.println("length");
        int l = in.nextInt();

        int vol_pyramid = (int) (l*w*h/3);
        System.out.println("Vol of pyramid : "+vol_pyramid);
    }
}
