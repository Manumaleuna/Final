package com.company;
import java.util.Stack;

//Write a Java program to push in 10 items into a stack data structure and reverse the stack's content.
public class Q1 {
        static Stack<Character> st = new Stack<>();
        static void insertAtBottom(char x) {
            if(st.isEmpty())
                st.push(x);
            else {
                char a = st.peek();
                st.pop();
                insertAtBottom(x);
                st.push(a);
            }
        }
        static void reverse() {
            if(st.size() > 0)
            {
                char x = st.peek();
                st.pop();
                reverse();
                insertAtBottom(x);
            }
        }

        public static void main(String[] args) {
            try {

                st.push('1');
                st.push('2');
                st.push('3');
                st.push('4');
                st.push('5');
                st.push('6');
                st.push('7');
                st.push('8');
                st.push('9');
                st.push('0');
                System.out.println("Main Stack");
                System.out.println(st);
                reverse();
                System.out.println("New Stack");
                System.out.println(st);
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }
