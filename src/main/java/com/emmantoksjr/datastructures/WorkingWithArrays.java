package com.emmantoksjr.datastructures;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int[] numbers = new int[2];

        numbers[0] = 2;
        numbers[1] = 3;

        Arrays.stream(numbers).forEach(System.out::println);

        String[] words = new String[] {"tosin", "tomi", "tobi", "toye"};

        System.out.println(Arrays.toString(words));

        int[] newNumbers = {1,23};

        int[][] multiDimentinalArrays = new int[3][3];

        for(int i = 0; i < multiDimentinalArrays.length; i++) {
            for (int j = 0; j < multiDimentinalArrays.length; j++){
                multiDimentinalArrays[i][j] = 0;
            }
        }
    }
}