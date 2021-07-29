package com.alehpineda.java.demo;

// Java program implementing Singleton class
// with getInstance() method
public class Singleton {

    // static variable single_instance of type singleton
    // private means only used inside the class
    // static means associated with the type itself
    private static Singleton single_instance = null;

    // variable of type string
    // public means can be used from outside the class
    public String s;

    // private constructor restricted to this class itself
    private Singleton(){
        s = "Hello world from a singleton class";
    }

    // static method to create instance of Singleton class
    public static Singleton getInstance(){
        if(single_instance == null){
            single_instance = new Singleton();
        }
        return single_instance;
    }

}
