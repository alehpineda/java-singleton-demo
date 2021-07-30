package com.alehpineda.java.demo;

// Java program implementing SingletonWithGetInstance class
// with getInstance() method
public class SingletonWithGetInstance {

    // static variable single_instance of type singleton
    // private means only used inside the class
    // static means associated with the type itself
    private static SingletonWithGetInstance single_instance = null;

    // variable of type string
    // public means can be used from outside the class
    public String s;

    // private constructor restricted to this class itself
    private SingletonWithGetInstance(){
        s = "Hello world from a singleton class";
    }

    // static method to create instance of SingletonWithGetInstance class
    public static SingletonWithGetInstance getInstance(){
        if(single_instance == null){
            single_instance = new SingletonWithGetInstance();
        }
        return single_instance;
    }

}
