package com.alehpineda.java.demo;

// Java program implementing Singleton class
// with method name as that of class
public class SingletonWithMethodName {

    // static variable single_instance of type Singleton
    private static SingletonWithMethodName single_instance=null;

    // variable of type String
    public String s;

    // private constructor restricted to this class itself
    private SingletonWithMethodName(){
        s = "Hello world, from a singleton with method name";
    }

    // static method to create instance of Singleton class
    public static  SingletonWithMethodName SingletonWithMethodName(){
        // Ensure only one instance is created
        if (single_instance == null){
            single_instance = new SingletonWithMethodName();
        }
        return single_instance;
    }
}
