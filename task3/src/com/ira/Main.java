package com.ira;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main (String[] args) {
        int[][] matrix = createMatrix(8, 5, 10, 99);
        for (int [] rov : matrix) {
            for (int cell : rov) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createMatrix(int iMax, int jMax, int valueFrom, int valueTo) {
        int[][] result = new int[iMax][jMax];
        for (int i = 0; i < iMax; i++) {
            for (int j = 0; j < jMax; j++) {
                result[i][j] = getRandomInt(valueFrom, valueTo);
            }
        }
        return result;
    }

    /**
     * https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
     * @param min
     * @param max
     * @return
     */
    private static int getRandomInt(int min, int max)
    {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
