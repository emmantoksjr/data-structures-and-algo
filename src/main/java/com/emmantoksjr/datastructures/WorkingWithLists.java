package com.emmantoksjr.datastructures;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("this");
        colors.add("that");

        System.out.println(colors.contains("this"));
        System.out.println(colors.size());

        for (String color: colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);
    }
}
