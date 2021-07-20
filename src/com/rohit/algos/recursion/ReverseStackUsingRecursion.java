package com.rohit.algos.recursion;

import java.util.Stack;

public class ReverseStackUsingRecursion {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        /*while (!stack.empty()) {
            System.out.println(stack.pop());
        }*/
        reverseStack(stack);
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }

        int element = stack.pop();
        reverseStack(stack);
        insertElement(stack, element);
    }

    public static void insertElement(Stack<Integer> stack, int element) {
        if (stack.empty()) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertElement(stack, element);
        stack.push(top);
    }


}
