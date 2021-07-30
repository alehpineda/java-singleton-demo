package com.alehpineda.java.demo;

// Java code for bill pugh
// singleton implementation
public class SingletonBillPugh {
    // public string
    public String s;

    // private constructor
    private SingletonBillPugh(){
        s = "Hello world, Singleton Bill Pugh";
    }
    // inner class to provide instance of class
    private static class BillPughSingleton{
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance(){
        return BillPughSingleton.INSTANCE;
    }
}
