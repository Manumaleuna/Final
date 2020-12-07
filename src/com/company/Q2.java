package com.company;
//Write a Java program to push in 10 items into a stack data structure and delete the middle item from the stack.
import java.util.*;
public class Q2 {
    static void deleteMid(Stack<String> drinks,
                          int n, int curr)
    {
        if (drinks.empty() || curr == n)
            return;
        String x = drinks.pop();
        deleteMid(drinks, n, curr+1);
        if (curr != n/2)
            drinks.push(x);
    }
    public static void main(String[] args){
        try {
            Stack<String> drinks = new Stack<>();
            drinks.push("Water");
            drinks.push("Coca Cola");
            drinks.push("Mountain Dew");
            drinks.push("Iced Tea");
            drinks.push("Lemonade");
            drinks.push("Sprite");
            drinks.push("Root Beer");
            drinks.push("Fanta");
            drinks.push("Coffee");
            drinks.push("Pepsi");
            drinks.push("Dr. Pepper");
            System.out.println("Before");
            System.out.println(drinks);
            deleteMid(drinks, drinks.size(), 0);
            System.out.println("After");
            System.out.println(drinks);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
