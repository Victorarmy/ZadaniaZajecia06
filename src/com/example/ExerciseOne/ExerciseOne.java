package com.example.ExerciseOne;

public class ExerciseOne {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String mirror = "";

        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
            mirror += array[array.length - 1 - i] + " ";
        }
        System.out.print(mirror);
    }
}
