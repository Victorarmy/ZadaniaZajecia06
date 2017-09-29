package com.example.ExerciseTwo;

public class MultiArrayTest {
    public static void main(String[] args) {
        MultiArray multiArray = new MultiArray(5, 2);

        multiArray.randomize();
        multiArray.print();

        System.out.println(multiArray.findMax());
        System.out.println(multiArray.findMin());
    }
}
