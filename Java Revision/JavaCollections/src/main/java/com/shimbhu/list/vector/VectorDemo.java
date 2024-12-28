package com.shimbhu.list.vector;


import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        // Access elements
        System.out.println("Element at index 1: " + vector.get(1)); // Output: Python

        // Remove an element
        vector.remove("C++");
        System.out.println("After Removal: " + vector);

        // Check size and capacity
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        // Add more elements to exceed initial capacity
        for (int i = 1; i <= 12; i++) {
            vector.add("Element " + i);
        }

        System.out.println("Size after additions: " + vector.size());
        System.out.println("Capacity after exceeding initial capacity: " + vector.capacity());

    }
}
