package com.company;
//Write a Java program to enqueue 10 items into a Queue data structure and reverse the Queue content
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q4 {
    static Queue<String> queue;

    static void reversequeue()
    {
        Stack<String> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
    }
    public static void main(String args[]) {
        try {
            queue = new LinkedList<String>();
            queue.add("Andy");
            queue.add("Brian");
            queue.add("Timmy");
            queue.add("Bill");
            queue.add("Tom");
            queue.add("Nicole");
            queue.add("Steven");
            queue.add("Kyle");
            queue.add("Paul");
            queue.add("Saul");
            System.out.println(queue);
            reversequeue();
            System.out.println(queue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
