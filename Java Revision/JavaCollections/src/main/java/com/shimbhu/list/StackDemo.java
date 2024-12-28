package com.shimbhu.list;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Create a Stack it is subclass of Vector
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack); // Output: [10, 20, 30]

        // Peek at the top element
        System.out.println("Peek: " + stack.peek()); // Output: 30

        // Pop elements
        System.out.println("Popped: " + stack.pop()); // Output: 30
        System.out.println("Stack after pop: " + stack); // Output: [10, 20]

        // Search for an element
        System.out.println("Position of 10: " + stack.search(10)); // Output: 2 (1-based position)

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.empty()); // Output: false
    }
}
