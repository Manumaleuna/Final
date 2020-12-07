package com.company;

import java.util.*;
import java.util.Queue;

//Write a Java program to enqueue 10 items into a Queue data structure and swap the Queue's first half with the second half.
public class Q5 {
    static Queue<String> Q1;

    static void splitQueue(Queue<String> q1) {
        Stack<String> st = new Stack<String>();
        int half = Q1.size() / 2;
        for (int i = 0; i < half; i++) {
            st.push(Q1.peek());
            Q1.poll();
        }
        while (!st.empty()) {
            q1.add(st.peek());
            st.pop();
        }

    }

    public static void main(String[] args) {
        try {
            Q1 = new LinkedList<String>();
            Q1.add("pizza");
            Q1.add("donuts");
            Q1.add("recess");
            Q1.add("Hershey");
            Q1.add("Pie");
            Q1.add("Salad");
            Q1.add("Chicken");
            Q1.add("Potatoes");
            Q1.add("Steak");
            Q1.add("Water");
            System.out.println(Q1);
            splitQueue(Q1);
            System.out.println(Q1);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}