package com.rohit.algos.recursion;

import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(0);
        stack.push(2);
        stack.push(12);
        sortStack(stack);

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    public static void sortStack(Stack<Integer> stack) {
        if (stack.size() == 1) {
            return;
        }

        int element = stack.pop();
        sortStack(stack);
        insert(stack, element);
    }

    public static void insert(Stack<Integer> stack, int element) {
        if (stack.empty() || stack.peek() >= element) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insert(stack, element);
        stack.push(top);
    }

}
