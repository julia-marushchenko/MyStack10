/**
 *  Java program to create, update, and display Stack instance.
 */

package com.mycollections;

import java.util.Stack;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Stack<Byte> myStack = new Stack<>();

        // Read empty stack.
        System.out.println(myStack); // Output: []

        // Show capacity of empty stack.
        System.out.println(myStack.capacity()); // Output: 10

        // Update.
        myStack.push((byte)-128);
        myStack.push((byte)-121);
        myStack.push((byte)-12);
        myStack.push((byte)0);
        myStack.push((byte)11);
        myStack.push((byte)12);
        myStack.push((byte)127);

        // Delete and show last.
        System.out.println("Deleted: " + myStack.pop()); // Output: Deleted: 127

        // Display.
        System.out.println(myStack); // Output: [-128, -121, -12, 0, 11, 12]

        // Show last.
        System.out.println("Last: " + 12); // Output: Last: 12

        // Clear.
        myStack.clear();

        // Check that instance of Stack is empty.
        System.out.println("Is empty: " + myStack.isEmpty()); // Output: Is empty: true

    }
}