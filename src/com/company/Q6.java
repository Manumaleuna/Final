package com.company;

import java.util.LinkedList;
import java.util.Queue;
//Write a Java program to enqueue 10 items into a Queue data structure called Alpha and enqueue 5 items into
// another Queue data structure called Omega.
// Join the two queue data structures and print out your output after each operation.
public class Q6 {
    static Queue<Integer> alpha;
    static Queue<Integer> omega;
     public void merge(Queue<Integer> alpha, Queue<Integer> omega){
        Queue<Integer> mergedQueue = new LinkedList<Integer>();
        

    }
    public static void main(String[] args) {
        alpha = new LinkedList<>();
        alpha.add(1);
        alpha.add(2);
        alpha.add(3);
        alpha.add(4);
        alpha.add(5);
        alpha.add(6);
        alpha.add(7);
        alpha.add(8);
        alpha.add(9);
        alpha.add(10);
        System.out.println(alpha);
        omega = new LinkedList<>();
        omega.add(11);
        omega.add(12);
        omega.add(13);
        omega.add(14);
        omega.add(15);
        System.out.println(omega);

    }

}
