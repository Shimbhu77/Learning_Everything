package com.shimbhu.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class IterableDemo {

    public static void main(String[] args) {

        // Create a List of integers using ArrayList
        // The List interface is part of the Java Collections Framework and allows ordered storage of elements
        List<Integer> list = new ArrayList<>();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the entire list
        System.out.println(list);

        // Using Iterator to traverse the list
        System.out.println("Using iterator method");

        // Create an Iterator for the list
        // An Iterator allows sequential traversal of elements in a collection
        Iterator<Integer> iterator = list.iterator();

        // Loop through the elements using the Iterator
        while (iterator.hasNext()) { // hasNext() checks if the list has more elements
            System.out.println(iterator.next()); // next() retrieves the next element
        }

        // Using a for-each loop to traverse the list
        System.out.println("Using for-each loop");

        // A for-each loop provides a simpler way to iterate over the elements of a collection
        for (int i : list) {
            System.out.println(i); // Print each element
        }

        // Using Spliterator to traverse the list
        System.out.println("Using spliterator method");

        // Create a Spliterator for the list
        // A Spliterator is used for traversing and partitioning elements in a collection
        Spliterator<Integer> spliterator = list.spliterator();

        // Display the characteristics of the Spliterator
        // characteristics() returns a set of characteristics about the Spliterator
        System.out.println("Characteristics: " + spliterator.characteristics());

        // Estimate the size of the remaining elements
        System.out.println("Estimated size: " + spliterator.estimateSize());

        // Sequential traversal using Spliterator
        System.out.println("Sequential traversal:");

        // Uncomment the line below to use method reference for traversal
        // spliterator.forEachRemaining(System.out::println);

        // Using a lambda expression to traverse the elements
        System.out.println("Lambda traversal:");

        // Note: Spliterator can be traversed only once. After that, it becomes exhausted.
        spliterator.forEachRemaining(i -> System.out.println(i)); // Process each element using a lambda

        Spliterator<Integer> split1 = list.spliterator();
        Spliterator<Integer> split2 = split1.trySplit();
        Spliterator<Integer> split3 = split2.trySplit();

        // traverse the first half of the list
        System.out.println("First Split:");
        split1.forEachRemaining(System.out::println);

        // traverse the second half of the list
        System.out.println("Second Split:");
        split2.forEachRemaining(System.out::println);

        // traverse the third half of the list
        System.out.println("Third Split:");
        split3.forEachRemaining(System.out::println);
    }
}
