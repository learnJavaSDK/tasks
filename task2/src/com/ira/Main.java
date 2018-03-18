package com.ira;

public class Main {
    public static void main (String[] args) {
        int count = 20;
        int[] fibo = getFiboRowOfNumber(count);
        for (int value: fibo) {
            System.out.print(value + " ");
        }
    }

    private static int[] getFiboRowOfNumber (int count) {
        int[] fibo = new int[count];
        if (count == 1) {
            fibo[0] = 1;
        } else if (count > 1) {
            fibo[0] = fibo[1] = 1;
            for (int i = 2; i <= count - 1 ; i++) {
                fibo[i] = fibo[i-1] + fibo[i-2];
            }
        }
        return fibo;
    }
}
