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

        // Singleton with lazy initialization
        SingletonWithLazyInitialization x5 = SingletonWithLazyInitialization.getInstance();
        SingletonWithLazyInitialization y5 = SingletonWithLazyInitialization.getInstance();
        SingletonWithLazyInitialization z5 = SingletonWithLazyInitialization.getInstance();

        System.out.println("String from x5 is "+x5.s);
        System.out.println("String from y5 is "+y5.s);
        System.out.println("String from z5 is "+z5.s);
        System.out.println("\n");

        // Upper case
        // Changing variable of instance of x1
        x5.s = (x5.s).toUpperCase();

        // All will be uppercase
        System.out.println("String from x5 is "+x5.s);
        System.out.println("String from y5 is "+y5.s);
        System.out.println("String from z5 is "+z5.s);
        System.out.println("\n");

        // Lower case
        // Changing variable of instance of x1
        x5.s = (x5.s).toLowerCase();

        // All will be uppercase
        System.out.println("String from x5 is "+x5.s);
        System.out.println("String from y5 is "+y5.s);
        System.out.println("String from z5 is "+z5.s);
        System.out.println("\n");

        // Singleton with thread safe
        SingletonThreadSafe x6 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe y6 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe z6 = SingletonThreadSafe.getInstance();

        System.out.println("String from x6 is "+x6.s);
        System.out.println("String from y6 is "+y6.s);
        System.out.println("String from z6 is "+z6.s);
        System.out.println("\n");

        // Upper case
        // Changing variable of instance of x1
        x6.s = (x6.s).toUpperCase();

        // All will be uppercase
        System.out.println("String from x6 is "+x6.s);
        System.out.println("String from y6 is "+y6.s);
        System.out.println("String from z6 is "+z6.s);
        System.out.println("\n");

        // Lower case
        // Changing variable of instance of x1
        x6.s = (x6.s).toLowerCase();

        // All will be uppercase
        System.out.println("String from x6 is "+x6.s);
        System.out.println("String from y6 is "+y6.s);
        System.out.println("String from z6 is "+z6.s);
        System.out.println("\n");

        // Singleton with double lock
        SingletonDoubleCheck x7 = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck y7 = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck z7 = SingletonDoubleCheck.getInstance();

        System.out.println("String from x7 is "+x7.s);
        System.out.println("String from y7 is "+y7.s);
        System.out.println("String from z7 is "+z7.s);
        System.out.println("\n");

        // Upper case
        // Changing variable of instance of x1
        x7.s = (x7.s).toUpperCase();

        // All will be uppercase
        System.out.println("String from x7 is "+x7.s);
        System.out.println("String from y7 is "+y7.s);
        System.out.println("String from z7 is "+z7.s);
        System.out.println("\n");

        // Lower case
        // Changing variable of instance of x1
        x7.s = (x7.s).toLowerCase();

        // All will be uppercase
        System.out.println("String from x7 is "+x7.s);
        System.out.println("String from y7 is "+y7.s);
        System.out.println("String from z7 is "+z7.s);
        System.out.println("\n");

        // Singleton Bill Pugh
        SingletonBillPugh x8 = SingletonBillPugh.getInstance();
        SingletonBillPugh y8 = SingletonBillPugh.getInstance();
        SingletonBillPugh z8 = SingletonBillPugh.getInstance();

        System.out.println("String from x8 is "+x8.s);
        System.out.println("String from y8 is "+y8.s);
        System.out.println("String from z8 is "+z8.s);
        System.out.println("\n");

        // Upper case
        // Changing variable of instance of x1
        x8.s = (x8.s).toUpperCase();

        // All will be uppercase
        System.out.println("String from x8 is "+x8.s);
        System.out.println("String from y8 is "+y8.s);
        System.out.println("String from z8 is "+z8.s);
        System.out.println("\n");

        // Lower case
        // Changing variable of instance of x1
        x8.s = (x8.s).toLowerCase();

        // All will be uppercase
        System.out.println("String from x8 is "+x8.s);
        System.out.println("String from y8 is "+y8.s);
        System.out.println("String from z8 is "+z8.s);
        System.out.println("\n");
    }
}
