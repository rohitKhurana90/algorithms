package com.rohit.algos.recursion;

import java.util.Stack;

public class MiddleElementInStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        deleteMiddleElement(stack, stack.size());
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    public static void deleteMiddleElement(Stack<Integer> stack, int size) {
        if (stack.size() == size / 2 + 1) {
            stack.pop();
            return;
        }
        int top = stack.pop();
        deleteMiddleElement(stack, size);
        stack.push(top);
    }

}
