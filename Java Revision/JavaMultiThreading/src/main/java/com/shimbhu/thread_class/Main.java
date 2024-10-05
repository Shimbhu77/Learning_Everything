package com.shimbhu.thread_class;

public class Main {
    public static void main(String[] args) {

        // creating object of thread class
        ThreadClass threadClass = new ThreadClass();

        System.out.println("Starting the main method. "+Thread.currentThread().getName());

        threadClass.start();

        System.out.println("Ending the main method : "+Thread.currentThread().getName());

    }
}