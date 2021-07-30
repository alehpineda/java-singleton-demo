package com.alehpineda.java.demo;

// Java code to create singleton class by
// Eager initialization
public class SingletonEagerInitialization {
    // public instance initialized when loading the class
    private static final SingletonEagerInitialization instance = new SingletonEagerInitialization();

    // Variable
    public String s;

    // Private constructor
    private SingletonEagerInitialization(){
        s = "Hello world, singleton with eager initialization";
    }
    // Static method to create instance
    public static SingletonEagerInitialization getInstance(){
        return instance;
    }
}
