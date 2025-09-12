package com.shimbhu;

import java.util.Objects;

public class SingletonDoubleLockingClass {

    private static volatile SingletonDoubleLockingClass instance;

    private SingletonDoubleLockingClass() {
    }

    public static SingletonDoubleLockingClass getInstance() {

        if (Objects.isNull(instance)) {

            synchronized (SingletonStaticClass.class) {
                if (Objects.isNull(instance)) {
                    instance = new SingletonDoubleLockingClass();
                }
            }

        }

        return instance;
    }

    public void display() {
        System.out.println("Hello, I'm Double Checked Lock Singleton. What about you ?");
    }
}
