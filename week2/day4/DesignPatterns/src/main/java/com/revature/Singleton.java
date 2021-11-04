package com.revature;


// A Singleton is a class that only allows you to instantiate one (single) of it
public class Singleton {

    // we set a private static instance of the object that belongs to the class
    private static Singleton instance;

    // we restrict the creation of singleton objects by making its constructor private
    private Singleton(){

    }

    // accessor that instantiates the object if null, or returns the object if not null.
    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
