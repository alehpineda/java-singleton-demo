package com.alehpineda.java.demo;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Singleton x1 = Singleton.getInstance();
        Singleton y1 = Singleton.getInstance();
        Singleton z1 = Singleton.getInstance();

        System.out.println("String from x1 is "+x1.s);
        System.out.println("String from y1 is "+y1.s);
        System.out.println("String from z1 is "+z1.s);
        System.out.println("\n");

        // Upper case
        // Changing variable of instance of x1
        x1.s = (x1.s).toUpperCase();

        // All will be uppercase
        System.out.println("String from x1 is "+x1.s);
        System.out.println("String from y1 is "+y1.s);
        System.out.println("String from z1 is "+z1.s);
        System.out.println("\n");

        // Lower case
        // Changing variable of instance of x1
        x1.s = (x1.s).toLowerCase();

        // All will be uppercase
        System.out.println("String from x1 is "+x1.s);
        System.out.println("String from y1 is "+y1.s);
        System.out.println("String from z1 is "+z1.s);
        System.out.println("\n");
    }
}
