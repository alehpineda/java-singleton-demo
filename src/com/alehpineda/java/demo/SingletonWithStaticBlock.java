package com.alehpineda.java.demo;

// Java code to create singleton class
// Using static block
public class SingletonWithStaticBlock {
    // public instance
    public static SingletonWithStaticBlock instance;

    // Public String variable
    public String s;
    // private constructor
    private SingletonWithStaticBlock(){
        s = "Hello world from a Singleton with Static Block";
    }

    // static block to initialize instance
    static {
        instance = new SingletonWithStaticBlock();
    }
}
