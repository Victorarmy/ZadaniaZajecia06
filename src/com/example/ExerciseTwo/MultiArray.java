package com.example.ExerciseTwo;

import java.util.Random;

public class MultiArray {
    private Integer[][] array;
    private Random random;

    public MultiArray(int rows, int columns) {
        this.array = new Integer[rows][columns];
        this.random = new Random();
        randomize();
    }

    public void randomize() {
        for (int i = 0; i < array.length; i ++) {
            for ( int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
    }

    public int findMin() {
        int lowestNumber = 101;

        for (int i = 0; i < array.length; i ++) {
            for ( int j = 0; j < array[0].length; j++) {
                lowestNumber = lowestNumber > array[i][j] ? array[i][j] : lowestNumber;
            }
        }
        return lowestNumber;
    }

    public int findMax() {
        int highestNumber = -1;

        for (int i = 0; i < array.length; i ++) {
            for ( int j = 0; j < array[0].length; j++) {
                highestNumber = highestNumber < array[i][j] ? array[i][j] : highestNumber;
            }
        }
        return highestNumber;
    }

    public void print() {
        for (int i = 0; i < array.length; i ++) {
            for ( int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
