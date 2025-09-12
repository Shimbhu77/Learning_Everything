package com.shimbhu;

import java.util.Objects;

public class SingletonStaticClass {

    private static SingletonStaticClass instance;

    private SingletonStaticClass(){}

    public static SingletonStaticClass getInstance(){

        if(Objects.isNull(instance)){
            instance = new SingletonStaticClass();
        }

        return instance;
    }

    public void display(){
        System.out.println("Hello, I'm Singleton. What about you ?");
    }
}
