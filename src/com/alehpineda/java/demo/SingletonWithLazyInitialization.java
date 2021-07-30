package com.alehpineda.java.demo;

// Java code to create singleton class
// With lazy initialization
public class SingletonWithLazyInitialization {
    // private instance, so that it can be
    // accessed only by getInstance method
    private static SingletonWithLazyInitialization instance;

    // Public string
    public String s;

    // private constructor
    private SingletonWithLazyInitialization(){
        s = "Hello world, Singleton with lazy initialization";
    }
    // method to return instance of class
    public static SingletonWithLazyInitialization getInstance(){
        if (instance == null){
            instance = new SingletonWithLazyInitialization();
        }
        return instance;
    }
}
