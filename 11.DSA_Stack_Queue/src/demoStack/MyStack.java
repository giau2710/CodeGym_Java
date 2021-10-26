package demoStack;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Tan");
        stack.push("Hoang");
        stack.push("Huu");
        System.out.println(stack);
        String a= stack.pop();
        System.out.println(a);
        System.out.println(stack);
        int index = stack.search("Hoang");
        System.out.println(index);
    }
}
