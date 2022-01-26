package com.emmantoksjr;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<String> pringles = new Stack<>();

        pringles.push("chips1");
        pringles.push("chips2");
        pringles.push("chips3");
        pringles.push("chips4");
        pringles.push("chips5");

        System.out.println(pringles.peek());
        System.out.println(pringles.size());
        System.out.println(pringles.pop());
        System.out.println(pringles.empty());
    }
}
