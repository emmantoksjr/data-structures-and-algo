package com.emmantoksjr.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Details> Customers = new LinkedList<>();

        Customers.add(new Details("Tosin", 23));
        Customers.add(new Details("Toas", 21));
        Customers.add(new Details("miwef", 4));
        Customers.add(new Details("ioow", 54));

        System.out.println(Customers.peek());
        System.out.println(Customers.poll());
        System.out.println(Customers.remove());
        System.out.println(Customers.peek());
    }

    record Details(String name, int age){}
}
