package com.alehpineda.java.demo;

// Java code for Singleton
// with double check locking
public class SingletonDoubleCheck {
    // private instance
    private static SingletonDoubleCheck instance;

    // Public String
    public String s;

    // private constructor
    private SingletonDoubleCheck(){
        s = "Hello world, Singleton with Double Lock";
    }

    public static SingletonDoubleCheck getInstance() {
        if (instance == null){
            // synchronized block to remove overhead
            synchronized (SingletonDoubleCheck.class){
                if (instance == null){
                    // if instance is null initialize
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
