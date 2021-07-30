package com.alehpineda.java.demo;

// Java program to create Thread Safe
// Singleton class
public class SingletonThreadSafe {
    // private instance, so that it can be
    // accessed only by getInstance method
    private static SingletonThreadSafe instance;

    // public string
    String s;

    // private constructor
    private SingletonThreadSafe(){
        s = "Hello world, Singleton thread safe";
    }

    // Synchronized method to control simultaneous access
    synchronized public static SingletonThreadSafe getInstance(){
        if (instance == null){
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
}
