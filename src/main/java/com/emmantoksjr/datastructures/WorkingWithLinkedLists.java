package com.emmantoksjr.datastructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedLists {
    public static void main(String[] args) {
        LinkedList<Customers> subscriptions = new LinkedList<>();

        subscriptions.add(new Customers("Tosin", 11));
        subscriptions.addFirst(new Customers("First", 13));

        ListIterator<Customers> iterator = subscriptions.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    record Customers(String name, int age){}
}
