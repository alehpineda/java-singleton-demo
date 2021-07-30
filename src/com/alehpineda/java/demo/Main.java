package com.alehpineda.java.demo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SingletonWithGetInstance x1 = SingletonWithGetInstance.getInstance();
        SingletonWithGetInstance y1 = SingletonWithGetInstance.getInstance();
        SingletonWithGetInstance z1 = SingletonWithGetInstance.getInstance();

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

        // Singleton with method name
        SingletonWithMethodName x2 = SingletonWithMethodName.SingletonWithMethodName();
        SingletonWithMethodName y2 = SingletonWithMethodName.SingletonWithMethodName();
        SingletonWithMethodName z2 = SingletonWithMethodName.SingletonWithMethodName();

        System.out.println("String from x2 is "+x2.s);
        System.out.println("String from y2 is "+y2.s);
        System.out.println("String from z2 is "+z2.s);
        System.out.println("\n");

        // Upper case
        // Changing variable of instance of x1
        x2.s = (x2.s).toUpperCase();

        // All will be uppercase
        System.out.println("String from x2 is "+x2.s);
        System.out.println("String from y2 is "+y2.s);
        System.out.println("String from z2 is "+z2.s);
        System.out.println("\n");

        // Lower case
        // Changing variable of instance of x1
        x2.s = (x2.s).toLowerCase();

        // All will be uppercase
        System.out.println("String from x2 is "+x2.s);
        System.out.println("String from y2 is "+y2.s);
        System.out.println("String from z2 is "+z2.s);
        System.out.println("\n");

        // Singleton with eager initialization
        SingletonEagerInitialization x3 = SingletonEagerInitialization.getInstance();
        SingletonEagerInitialization y3 = SingletonEagerInitialization.getInstance();
        SingletonEagerInitialization z3 = SingletonEagerInitialization.getInstance();

        System.out.println("String from x3 is "+x3.s);
        System.out.println("String from y3 is "+y3.s);
        System.out.println("String from z3 is "+z3.s);
        System.out.println("\n");

        // Upper case
        // Changing variable of instance of x1
        x3.s = (x3.s).toUpperCase();

        // All will be uppercase
        System.out.println("String from x3 is "+x3.s);
        System.out.println("String from y3 is "+y3.s);
        System.out.println("String from z3 is "+z3.s);
        System.out.println("\n");

        // Lower case
        // Changing variable of instance of x1
        x3.s = (x3.s).toLowerCase();

        // All will be uppercase
        System.out.println("String from x3 is "+x3.s);
        System.out.println("String from y3 is "+y3.s);
        System.out.println("String from z3 is "+z3.s);
        System.out.println("\n");

        // Singleton with static block
        SingletonWithStaticBlock x4 = SingletonWithStaticBlock.instance;
        SingletonWithStaticBlock y4 = SingletonWithStaticBlock.instance;
        SingletonWithStaticBlock z4 = SingletonWithStaticBlock.instance;

        System.out.println("String from x4 is "+x4.s);
        System.out.println("String from y4 is "+y4.s);
        System.out.println("String from z4 is "+z4.s);
        System.out.println("\n");

        // Upper case
        // Changing variable of instance of x1
        x4.s = (x4.s).toUpperCase();

        // All will be uppercase
        System.out.println("String from x4 is "+x4.s);
        System.out.println("String from y4 is "+y4.s);
        System.out.println("String from z4 is "+z4.s);
        System.out.println("\n");

        // Lower case
        // Changing variable of instance of x1
        x4.s = (x4.s).toLowerCase();

        // All will be uppercase
        System.out.println("String from x4 is "+x4.s);
        System.out.println("String from y4 is "+y4.s);
        System.out.println("String from z4 is "+z4.s);
        System.out.println("\n");
    }
}
