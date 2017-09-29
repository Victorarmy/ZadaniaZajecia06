package com.example.ExerciseThree;

public class ArrayComparator {

    public static boolean compare(boolean[][] arrayOne, boolean[][] arrayTwo) {
        boolean result = true;

        if (arrayOne.length != arrayTwo.length || arrayOne[0].length != arrayTwo[0].length) {
            return false;
        }

        for (int i = 0; i < arrayOne.length && result; i ++) {
            for (int j = 0; j < arrayOne[0].length && result; j++) {
                result = !(arrayOne[i][j] ^ arrayTwo[i][j]);
            }
        }

        return result;
    }
}
