package com.ira;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        ArrayRangeCreator creator = new ArrayRangeCreator();
        int data[] = creator.createArrayWithOddNumbers(1, 99);
        for (int value: data) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
    }
}
